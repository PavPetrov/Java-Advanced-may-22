import java.util.Arrays;
import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix1 = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];


        for (int row = 0; row < rows; row++) {
            matrix1[row] = scanner.nextLine()
                    .replaceAll(" ", "").toCharArray();
        }
        for (int row = 0; row < rows; row++) {
            matrix2[row] = scanner.nextLine()
                    .replaceAll(" ", "").toCharArray();
        }
        char[][] resultMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstElement = matrix1[row][col];
                char secondElement = matrix2[row][col];
                char fillChar = firstElement == secondElement ? firstElement : '*';
                resultMatrix[row][col] = fillChar;
            }
        }

        for (char[] arrC : resultMatrix) {
            for (char c : arrC) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}




