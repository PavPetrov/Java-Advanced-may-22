import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> emailMap = new LinkedHashMap<>();
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("stop")){
            String name = inputLine;
            String email = scanner.nextLine();
            if(!(email.contains(".uk") || email.contains(".us") || email.contains(".com"))){
                emailMap.put(name, email);
            }

            inputLine = scanner.nextLine();
        }

        emailMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " -> "+ e.getValue()));
    }
}
