package P05_GenericCountMethodStrings;

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
        String elem = scanner.nextLine();

        System.out.println(box.getCountOfGreater(elem));


    }
}