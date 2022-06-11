import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.nextLine();

        Map<String, String> phoneBook = new LinkedHashMap<>();
        while (!entry.equals("search")) {
            String[] contact = entry.split("-");
            String name = contact[0];
            String phone = contact[1];
            phoneBook.put(name, phone);
            entry = scanner.nextLine();
        }
        entry = scanner.nextLine();
        while (!entry.equals("stop")) {
            if (phoneBook.containsKey(entry)) {
                System.out.printf("%s -> %s%n", entry, phoneBook.get(entry));
            } else {
                System.out.printf("Contact %s does not exist.%n", entry);
            }
            entry = scanner.nextLine();
        }
    }
}
