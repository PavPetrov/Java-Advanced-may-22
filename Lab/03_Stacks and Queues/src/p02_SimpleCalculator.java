import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] input =scanner.nextLine().split(" ");

        Collections.addAll(stack, input);

        while (stack.size()>1){
            int firstElem = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondElem = Integer.parseInt(stack.pop());
            switch (operator){
                case "+":
                    stack.push(String.valueOf(firstElem + secondElem));
                    break;
                case "-":
                    stack.push(String.valueOf(firstElem - secondElem));
                    break;
            }
        }
        System.out.println(stack.peek());
    }
}
