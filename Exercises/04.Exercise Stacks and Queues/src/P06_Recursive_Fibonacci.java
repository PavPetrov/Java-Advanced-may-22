import java.util.Scanner;

public class P06_Recursive_Fibonacci {
    static long memory[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        memory = new long[n + 1];

        long startTime = System.nanoTime();
        long result = fib(n);
        long stopTime = System.nanoTime();



        System.out.println(result);

        System.out.println("time: " + (stopTime - startTime));
    }

    private static long fib(int n) {
        if (n < 2) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        } else memory[n] = fib(n - 1) + fib(n - 2);
        return memory[n];
    }
}

