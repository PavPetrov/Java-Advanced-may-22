import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03_CustomMInFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

       /* Function<int[], Integer> getMin = integers -> {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] < min) {
                    min = integers[i];
                }
            }
            return min;
        };*/
        Function<int[], Integer> getMin = ints -> Arrays.stream(ints).min().getAsInt();
        Function<int[], Integer> getMin1 = ints -> Collections.min(Arrays.stream(ints).boxed().collect(Collectors.toList()));

        System.out.println(getMin.apply(numbers));

    }
}
