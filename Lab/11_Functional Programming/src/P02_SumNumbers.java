import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> countFormatter = l -> "Count = " + l.size();
        Function<List<Integer>, String> sumElements =
                list -> "Sum = " + String.valueOf(list.stream().mapToInt(e -> e).sum());

        System.out.println(countFormatter.apply(numbers));
        System.out.println(sumElements.apply(numbers));
    }
}
