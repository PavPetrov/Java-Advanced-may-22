import java.util.ArrayDeque;
import java.util.Scanner;

public class p07_BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nextUrl = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();
        String currentUrl = "blank";

        while (!nextUrl.equals("Home")) {

            if (nextUrl.equals("back")) {
                if (!history.isEmpty()) {
                    forward.push(currentUrl);
                    currentUrl = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    nextUrl = scanner.nextLine();
                    continue;
                }

            } else if (nextUrl.equals("forward")) {
                if (!forward.isEmpty()) {
                    history.push(currentUrl);
                    currentUrl = forward.pop();

                } else {
                    System.out.println("no next URLs");
                    nextUrl = scanner.nextLine();
                    continue;
                }

            } else {
                if (!currentUrl.equals("blank")) {
                    history.push(currentUrl);
                }
                forward.clear();
                currentUrl = nextUrl;

            }

            System.out.println(currentUrl);
            nextUrl = scanner.nextLine();
        }
    }
}
