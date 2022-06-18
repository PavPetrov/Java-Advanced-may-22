import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new LinkedList<>();

        while (n-- > 0){
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);;
            Person person = new Person(name, age);
            personList.add(person);
        }

        personList.stream().filter(person -> person.getAge() > 30 )
                .sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}
