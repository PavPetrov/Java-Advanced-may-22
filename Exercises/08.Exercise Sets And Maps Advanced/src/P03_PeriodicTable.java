import java.util.*;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Set<String> set = new TreeSet<>();

        while (num-- > 0) {
            //  String[] token = scanner.nextLine().split(" ");
            //  Collections.addAll(set, token);
            set.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }

        System.out.println(String.join(" ", set));
    }
}
