import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>, Integer> minElementIndex = l -> {
            int minIndex = -1;
            int minElem = Integer.MAX_VALUE;
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) <= minElem) {
                    minElem = l.get(i);
                    minIndex = i;
                }
            }
            return minIndex;
        };

        System.out.println(minElementIndex.apply(list));
    }
}
