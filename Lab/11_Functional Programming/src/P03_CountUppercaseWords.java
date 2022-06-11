import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class P03_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<String> startWithUppercase = w -> Character.isUpperCase(w.charAt(0));

        List<String> upperCaseList = Arrays.stream(scanner.nextLine().split(" ")).
                filter(startWithUppercase).collect(Collectors.toList());

        System.out.println(upperCaseList.size());
        upperCaseList.forEach(System.out::println);


        //   Consumer<String> printer = System.out::println;
        //   upperCaseList.forEach(printer);

        //   System.out.println(String.join(System.lineSeparator(), upperCaseList));

       /* Predicate<String> s;




        Supplier<String> ss;


        Consumer<String> ss;








        */
    }
}
