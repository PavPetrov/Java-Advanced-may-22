import java.util.Scanner;

public class P07_FindTheRealQueen$$ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[8][8];

        for (int row = 0; row < 8; row++) {
            char[] rowLine = scanner.nextLine().replaceAll(" ", "").toCharArray();
            matrix[row] = rowLine;
        }
        findReelQueen(matrix);

    }

    private static void findReelQueen(char[][] matrix) {
        int[] result = {-1, -1};
        boolean isRealQueen = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char currentChar = matrix[row][col];
                if (currentChar == 'q') {
                    isRealQueen = rowColCheck(row, col, matrix) && diagonalCheck(row, col, matrix);
                }
                if (isRealQueen) {
                    System.out.println(row + " " + col);
                    isRealQueen = false;
                }
            }
        }
    }

    private static boolean diagonalCheck(int row, int col, char[][] matrix) {

        // Down-Right Diagonal
        for (int i = 1; i < matrix.length - 1; i++) {
            if (!isInBound(row + i, col + i)) {
                if (matrix[row + i][col + i] == 'q') {
                    return false;
                } else break;
            }
        }
        // Up-Right Diagonal
        for (int i = 1; i < matrix.length - 1; i++) {
            if (!isInBound(row - i, col + i)) {
                if (matrix[row - i][col + i] == 'q') {
                    return false;
                } else break;
            }
        }
        //Down-Left Diagonal
        for (int i = 1; i < matrix.length - 1; i++) {
            if (!isInBound(row + i, col - i)) {
                if (matrix[row + i][col - i] == 'q') {
                    return false;
                }
            } else break;
        }
        //Up-Left Diagonal
        for (int i = 1; i < matrix.length - 1; i++) {
            if (!isInBound(row - i, col - i)) {
                if (matrix[row - i][col - i] == 'q') {
                    return false;
                }
            } else break;
        }
        return true;
    }

    private static boolean isInBound(int row, int col) {
        return (row < 0 || row > 7 || col < 0 || col > 7);
    }

    private static Boolean rowColCheck(int row, int col, char[][] matrix) {
        int countQ = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] == 'q') {
                countQ++;
            }
            if (matrix[row][i] == 'q') {
                countQ++;
            }
        }
        return countQ == 2;
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