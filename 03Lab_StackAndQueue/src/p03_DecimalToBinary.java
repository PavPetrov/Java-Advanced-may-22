import java.util.ArrayDeque;
import java.util.Scanner;

public class p03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();
        if (decimal == 0) {
            System.out.println("0");
        }
        while (decimal != 0) {
            binaryStack.push(decimal % 2);
            decimal /= 2;
        }
        for (Integer integer : binaryStack) {
            System.out.print(binaryStack.pop());
        }
    }
}
