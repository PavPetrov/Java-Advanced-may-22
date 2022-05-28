import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_ReverseNumbers { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] input = scanner.nextLine().split(" ");
    ArrayDeque<Integer> stack = new ArrayDeque<>();

    for (String s : input) {
        stack.push(Integer.parseInt(s));
    }

    for (Integer integer : stack) {
        System.out.print(stack.pop() + " ");
    }
}
}
