import java.util.ArrayDeque;
import java.util.Scanner;

public class p01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nextUrl = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        String currentUrl = "";

        while (!nextUrl.equals("Home")) {

            if (nextUrl.equals("back")) {

                if (!history.isEmpty()) {
                    currentUrl = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    nextUrl = scanner.nextLine();
                    continue;
                }

            } else {
                if (!currentUrl.equals("")) {
                    history.push(currentUrl);
                }
                currentUrl = nextUrl;

            }

            System.out.println(currentUrl);
            nextUrl = scanner.nextLine();
        }
    }
}
