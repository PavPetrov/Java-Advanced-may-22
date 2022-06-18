package P03_SwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        while (n-- > 0) {
            String input = scanner.nextLine();

            box.add(input);
        }

        String[] input = scanner.nextLine().split(" ");
        int index1 = Integer.parseInt(input[0]);
        int index2 = Integer.parseInt(input[1]);

        box.swap(index1, index2);




        System.out.println(box.toString());
    }
}