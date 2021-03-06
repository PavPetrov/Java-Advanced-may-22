import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class P04_AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = aDouble -> aDouble * 1.2;
        Consumer<Double> printer = aDouble -> System.out.printf("%.2f%n", aDouble);

        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", ")).map(Double::parseDouble)
                .map(addVat).forEach(printer);
    }
}
