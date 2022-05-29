import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> countNumbers = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (double number : numbers) {
            if (!countNumbers.containsKey(number)){
                countNumbers.put(number, 1);
            } else {
                int currentCount = countNumbers.get(number);
                countNumbers.put(number, currentCount + 1);
            }
        }

        for (var num : countNumbers.entrySet()) {
            System.out.printf("%.1f -> %d%n", num.getKey(), num.getValue());;
        }
    }
}
