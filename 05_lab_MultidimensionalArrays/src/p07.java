import java.util.Scanner;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];

        for (int row = 0; row < 8; row++) {
            char[] rowLine = scanner.nextLine().replaceAll(" ", "").toCharArray();
            matrix[row] = rowLine;
        }
        int[] result = findReelQueen(matrix);

    }

    private static int[] findReelQueen(char[][] matrix) {
        boolean isValid = false;
        int[] result = {-1, -1};
        int rows = matrix.length;
        int cols = matrix[rows].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols ; col++) {
                char currentChar = matrix[row][col];
                 isValid = checkRowCol(matrix,row,col);
                 isValid = checkDiagonals(matrix, row,col);
            }

        }
        return result;
    }

    private static boolean checkRowCol(char[][] matrix, int row, int col) {
        return true;
    }

    private static boolean checkDiagonals(char[][] matrix, int row, int col) {
      return true;
    }
}
//Write a program that reads (8 x 8) matrix of characters from the console.
// The matrix represents a chessboard with figures on it.
// The figures can be - queens as char 'q' or any other ASCII symbol.
// There will be more than one queen but only one queen will have a valid position,
// which is not attacked by any other queen and does not attack any other queen.
// In another word, in the way of the valid queen, there are no other queens,
// but there may be any other ASCII symbol. Your task is to read the chessboard
// nd find the position of the valid queen. According to chess rules,
// the queen can attack all the cells in horizontal verticals and both diagonals,
// which cross the queen position.
//
//Examples
//
//Input Output
//
//p a p a p a p a                   4 3
//p a p a p a p a
//p a q a p a q a
//a p a !Q! a p q p
//a p a p a p a p
//a p a p a q a p
//a q a p a p a p a p a