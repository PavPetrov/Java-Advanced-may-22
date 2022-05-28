import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int elementsToPush = input[0];
        int elementsToPop = input[1];
        int elementIsExist = input[2];
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            stack.push(elements[i]);
        }

        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
            if (stack.isEmpty()) {
                System.out.println("0");
                return;
            }
        }
        if (stack.contains(elementIsExist)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
