import java.util.Arrays;
import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            int[] rowLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowLine;
        }
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < size; i++) {
            primaryDiagonal += matrix[i][i];
        }
        for (int i = size - 1; i >= 0; i--) {
            secondaryDiagonal += matrix[i][size - 1 - i];
        }
        int result = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println(result);
    }

    private static void readSqMatrix(int[][] matrix, int size) {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < size; row++) {
            int[] rowLine = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowLine;
        }
    }
}
