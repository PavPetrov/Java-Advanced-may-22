import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = readMatrix(scanner);
        int[][] matrix2 = readMatrix(scanner);


        System.out.println(equalMatrix(matrix1, matrix2) ? "equal" : "not equal");


        //  printMatrix(matrix1);


    }

    private static boolean equalMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }

        for (int row = 0; row < matrix1.length; row++) {
            if (matrix1[row].length != matrix2[row].length) {
                return false;
            }
            for (int col = 0; col < matrix1[row].length; col++) {
                if (matrix1[row][col] != matrix2[row][col]) {
                    return false;
                }
            }

        }

        return true;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int el : rows) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] rowLine = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = rowLine;
        }
        return matrix;
    }
}
