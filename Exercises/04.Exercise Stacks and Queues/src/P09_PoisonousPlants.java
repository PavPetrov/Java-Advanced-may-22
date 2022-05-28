import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class P09_PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] plants = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> plantsStack = new ArrayDeque<>();
        ArrayDeque<Integer> reducedPlants = new ArrayDeque<>();

        int daysCount = 0;

        for (int plant : plants) {
            plantsStack.push(plant);
        }

        boolean isRemoved = true;
        //    System.out.println(plantsStack.pop());
        while (isRemoved) {

            while (plantsStack.size() > 1) {
                int rightElement = plantsStack.pop();
                int leftElement = plantsStack.peek();
                if (leftElement >= rightElement) {
                    reducedPlants.push(rightElement);
                }
            }
            if (reducedPlants.isEmpty()) {
                isRemoved = false;
            }
            reducedPlants.push(plantsStack.pop());
            plantsStack.addAll(reducedPlants);
            reducedPlants.clear();
            daysCount++;
        }
        System.out.println(daysCount - 1);

    }
}
