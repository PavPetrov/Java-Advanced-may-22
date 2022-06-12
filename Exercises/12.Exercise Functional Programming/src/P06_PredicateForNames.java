import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Predicate<String> namePredicate = n -> n.length() <= num;

        names.stream().filter(namePredicate).forEach(System.out::println);
    }
}
