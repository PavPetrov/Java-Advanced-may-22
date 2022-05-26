import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> circleQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).
                forEach(circleQueue::offer);
        int countNumber = Integer.parseInt(scanner.nextLine());

        while (circleQueue.size() >1){
            for (int i = 1; i < countNumber; i++) {
                circleQueue.offer(circleQueue.poll());
            }
            System.out.println("Removed " + circleQueue.poll());
        }
        System.out.println("Last is " + circleQueue.poll());
    }
}
