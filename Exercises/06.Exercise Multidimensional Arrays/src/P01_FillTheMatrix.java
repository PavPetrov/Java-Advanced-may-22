import java.util.Scanner;
import java.util.function.IntPredicate;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        int[][] matrix = new int[size][size];

        String pattern = input[1];

        if (pattern.equals("A")) {
            fillPatternA(matrix);
        } else if (pattern.equals("B")) {
            fillPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] r : matrix) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    private static void fillPatternB(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int digit = 1;
        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = digit;
                    digit++;
                }
            } else {
                for (int row = rows - 1; row >= 0; row--) {
                    matrix[row][col] = digit;
                    digit++;
                }
            }

        }
    }

    private static void fillPatternA(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int digit = 1;
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][col] = digit;
                digit++;
            }
        }
    }
}
