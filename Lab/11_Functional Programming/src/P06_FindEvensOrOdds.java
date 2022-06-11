package P06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String condition = scanner.nextLine();
        int start = range[0];
        int end = range[1];

        System.out.println(IntStream.rangeClosed(start, end).boxed().filter(getPredicate(condition))
                .map(String::valueOf).collect(Collectors.joining(" ")));


    }

    public static Predicate<Integer> getPredicate(String condition) {

        switch (condition) {
            case "odd":
                return integer -> integer % 2 != 0;
            case "even":
                return integer -> integer % 2 == 0;
            default:
                throw new IllegalArgumentException();
        }

    }
}
