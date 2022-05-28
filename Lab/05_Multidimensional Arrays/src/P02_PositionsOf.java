import java.util.Arrays;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;


        for (int row = 0; row < matrix.length; row++) {
            int[] rowLine = matrix[row];
            for (int col = 0; col < rowLine.length; col++) {
                if ( num == matrix[row][col]){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if (!isFound){
            System.out.println("not found");
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
