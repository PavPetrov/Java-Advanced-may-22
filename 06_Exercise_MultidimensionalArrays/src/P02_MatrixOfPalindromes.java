import java.util.Arrays;
import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        String[][] matrixPalindromes = new String[rows][cols];

        matrixPalindromes = fillMatrixPalindromes(rows, cols, 'a');
        printMatrix(matrixPalindromes);
    }

    private static String[][] fillMatrixPalindromes(int rows, int cols, char ch) {
        String[][] matrixPalindromes = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstChar = (char) (ch + row);
                char middleChar = (char) (firstChar +col);
               matrixPalindromes[row][col] = "" + firstChar + middleChar + firstChar;
            }
        }
        return matrixPalindromes;
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] r : matrix) {
            for (String c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
