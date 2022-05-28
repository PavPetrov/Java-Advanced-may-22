import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_BalancedParentheses1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        ArrayDeque<Character> openBracketStack = new ArrayDeque<>();
        ArrayDeque<Character> closeBracketQueue = new ArrayDeque<>();
        boolean isValid = true;

        if (brackets.length() % 2 != 0) {
            isValid = false;
        } else {
            for (int i = 0; i < brackets.length() / 2; i++) {
                openBracketStack.push(brackets.charAt(i));
                closeBracketQueue.push(brackets.charAt(brackets.length() - 1 - i));
            }
            for (int i = 0; i < openBracketStack.size(); i++) {
                char currentOpen = openBracketStack.pop();
                char currentClose = closeBracketQueue.pop();
                if (currentOpen == '(' && currentClose != ')') {
                    isValid = false;
                }
                if (currentOpen == '{' && currentClose != '}') {
                    isValid = false;
                }
                if (currentOpen == '[' && currentClose != ']') {
                    isValid = false;
                }
            }
        }

        System.out.println(isValid ? "YES" : "NO");
    }
}
