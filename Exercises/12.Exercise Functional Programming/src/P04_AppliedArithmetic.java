import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        String command = scanner.nextLine();

        UnaryOperator<List<Integer>> addFunction = integers -> integers.stream()
                .map(e -> e + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = integers -> integers.stream()
                .map(e -> e * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = integers -> integers.stream()
                .map(e -> e - 1).collect(Collectors.toList());

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    intList = addFunction.apply(intList);
                    break;
                case "multiply":
                    intList = multiplyFunction.apply(intList);
                    break;
                case "subtract":
                    intList = subtractFunction.apply(intList);
                    break;
                case "print":
                    intList.forEach(e -> System.out.printf("%d ", e));
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }

    }
}
