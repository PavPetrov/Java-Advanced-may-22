import java.util.Arrays;
import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            try {
                String[] command = input.split(" ");
                if (!command[0].equals("swap") || command.length != 5) {
                    System.out.println("Invalid input!");
                    input = scanner.nextLine();
                    continue;
                }

                int row = Integer.parseInt(command[1]);
                int col = Integer.parseInt(command[2]);
                int swapRow = Integer.parseInt(command[3]);
                int swapCol = Integer.parseInt(command[4]);

                String temp = matrix[row][col];
                matrix[row][col] = matrix[swapRow][swapCol];
                matrix[swapRow][swapCol] = temp;
                printMatrix(matrix);
            } catch (IndexOutOfBoundsException e){
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
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