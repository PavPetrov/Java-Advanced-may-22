import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBrackets.push(currentBracket);
            } else {
                if (openBrackets.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char lastOpenBracket = openBrackets.pop();
                if (lastOpenBracket == '(' && currentBracket != ')') {
                    isBalanced = false;
                }
                if (lastOpenBracket == '{' && currentBracket != '}') {
                    isBalanced = false;
                }
                if (lastOpenBracket == '[' && currentBracket != ']') {
                    isBalanced = false;
                }
            }
        }
        System.out.println(isBalanced && openBrackets.isEmpty() ? "YES" : "NO");
    }
}
