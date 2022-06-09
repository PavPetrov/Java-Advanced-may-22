import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int firstSetSize = input[0];
        int secondSetSize = input[1];

        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> secondSet = new LinkedHashSet<>();

        while (firstSetSize-- > 0){
            firstSet.add(scanner.nextLine());
        }

        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(scanner.nextLine());
        }
         firstSet.retainAll(secondSet);
        System.out.println(String.join(" ", firstSet));
    }
}
