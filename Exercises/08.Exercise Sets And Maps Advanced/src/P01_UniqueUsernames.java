import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();
        while (number-- > 0) {
            String username = scanner.nextLine();
            usernames.add(username);
        }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}