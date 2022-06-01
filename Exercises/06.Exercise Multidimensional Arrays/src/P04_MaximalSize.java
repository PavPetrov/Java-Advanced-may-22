import java.util.Arrays;
import java.util.Scanner;

public class P04_MaximalSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        matrix = fillMatrix(rows, cols, scanner);

        int maxSum = Integer.MIN_VALUE;
        int bestRowIndex = -1;
        int bestColIndex = -1;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col +1] + matrix[row][col+2]
                        + matrix[row +1][col] + matrix[row+1][col +1] + matrix[row +1][col+2]
                        + matrix[row + 2][col] + matrix[row +2][col +1] + matrix[row +2][col+2];
                if (sum > maxSum){
                    maxSum = sum;
                    bestRowIndex = row;
                    bestColIndex = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printSquareFromMatrix (bestRowIndex, bestColIndex, matrix, 3);

     //   System.out.println();
    }

    private static void printSquareFromMatrix(int row, int col, int[][] matrix, int size) {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size ; c++) {
                System.out.print(matrix[row+ r][col + c] +" ");
            }
            System.out.println();
        }
    }


    private static int[][] fillMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
