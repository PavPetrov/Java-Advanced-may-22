package P01_GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            Box box = new Box(scanner.nextLine());
            System.out.println(box.toString());
        }

    }
}
