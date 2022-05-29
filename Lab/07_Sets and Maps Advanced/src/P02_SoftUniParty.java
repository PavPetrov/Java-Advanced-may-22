import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guestName = scanner.nextLine();

        Set<String> vipGuest = new TreeSet<>();
        //   Set<String> regularGuest = new TreeSet<>();                  //Solution with two sorted Sets
        while (!guestName.equals("PARTY")) {
            vipGuest.add(guestName);                                   // Solution with one sorted Set
        /*    if (Character.isDigit(guestName.charAt(0))) {
                vipGuest.add(guestName);
            } else {
                regularGuest.add(guestName);
            }*/
            guestName = scanner.nextLine();
        }
        guestName = scanner.nextLine();
        while (!guestName.equals("END")) {
            //        regularGuest.remove(guestName);
            vipGuest.remove(guestName);
            guestName = scanner.nextLine();
        }
        System.out.println(vipGuest.size());
        //    System.out.println(vipGuest.size() + regularGuest.size);

        for (String v : vipGuest) {
            System.out.println(v);
        }
     /*   for (String r : regularGuest) {
            System.out.println(r);
        }*/

    }
}
