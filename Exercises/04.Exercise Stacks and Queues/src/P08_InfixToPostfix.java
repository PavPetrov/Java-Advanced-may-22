import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> inputToken = new ArrayDeque<>();
        ArrayDeque<String> outPUTQueue = new ArrayDeque<>();
        ArrayDeque<String> operatorStack = new ArrayDeque<>();

        for (String s : input) {
            inputToken.push(s);
        }

        while (!inputToken.isEmpty()) {
            String currentString = inputToken.pop();
            if (currentString.matches("\\d+")) {
                outPUTQueue.push(currentString);
            }
            if (currentString.matches("[\\+\\-\\/*]")) {
                operatorStack.push(currentString);

            }
        }
        for (String s : outPUTQueue) {
            System.out.print(s + " ");
        }
        for (String s : operatorStack) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    //https://en.wikipedia.org/wiki/Shunting_yard_algorithm

    //while there are tokens to be read:

    //    - an operator o1:
    //        while (
    //            there is an operator o2 other than the left parenthesis at the top
    //            of the operator stack, and (o2 has greater precedence than o1
    //            or they have the same precedence and o1 is left-associative)
    //        ):
    //            pop o2 from the operator stack into the output queue
    //        push o1 onto the operator stack
    //    - a left parenthesis (i.e. "("):
    //        push it onto the operator stack
    //    - a right parenthesis (i.e. ")"):
    //        while the operator at the top of the operator stack is not a left parenthesis:
    //            {assert the operator stack is not empty}
    //            /* If the stack runs out without finding a left parenthesis, then there are mismatched parentheses. */
    //            pop the operator from the operator stack into the output queue
    //        {assert there is a left parenthesis at the top of the operator stack}
    //        pop the left parenthesis from the operator stack and discard it
    //        if there is a function token at the top of the operator stack, then:
    //            pop the function from the operator stack into the output queue
    ///* After the while loop, pop the remaining items from the operator stack into the output queue. */
    //while there are tokens on the operator stack:
    //    /* If the operator token on the top of the stack is a parenthesis, then there are mismatched parentheses. */
    //    {assert the operator on top of the stack is not a (left) parenthesis}
    //    pop the operator from the operator stack onto the output queue


}

