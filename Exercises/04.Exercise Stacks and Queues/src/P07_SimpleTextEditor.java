import java.util.ArrayDeque;
import java.util.Scanner;

public class P07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];

            switch (command) {
                case "1":
                    textAdd(input[1], text);
                    textStack.push(String.valueOf(text));
          //          System.out.println(text);
                    break;
                case "2":
                    int eraseCount = Integer.parseInt((input[1]));
                    textDel(eraseCount, text);
                    textStack.push(String.valueOf(text));
       //             System.out.println(text);
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    textStack.pop();
                    text = new StringBuilder();
                    text = textStack.isEmpty() ? text.append("") : text.append(textStack.peek());
        //            System.out.println(text);
                    break;
            }

            //           System.out.println(text);
        }

    }


    private static void textDel(int eraseCount, StringBuilder text) {
        while (eraseCount > 0) {
            text.deleteCharAt(text.length() - 1);
            eraseCount--;
        }
    }

    private static void textAdd(String s, StringBuilder text) {
        text.append(s);

    }
}
