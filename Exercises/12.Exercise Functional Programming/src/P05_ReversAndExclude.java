import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_ReversAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> predicate = num-> num % n == 0;
        numbers.removeIf(predicate);
       // numbers.removeIf(num-> num % n == 0);
        Collections.reverse(numbers);
        numbers.forEach(num -> System.out.print(num +" "));
    }
}
