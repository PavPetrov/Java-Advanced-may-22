import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_FilterByAge {
    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new LinkedList<>();
        int number = Integer.parseInt(scanner.nextLine());

        while (number-- > 0) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];

            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        String ageCondition = scanner.nextLine();
        int ageFilter = Integer.parseInt(scanner.nextLine());
        String printFormat = scanner.nextLine();


        people = filterByAge(people, getPredicate(ageFilter, ageCondition));

        Consumer<Person> formatter = getPrintFormat(printFormat);

        people.forEach(formatter);

    }

    private static Consumer<Person> getPrintFormat(String printFormat) {             // формата за принтирането .forEach(~)
        switch (printFormat) {
            case "name age":
                return person -> System.out.println(person.name + " - " + person.age);
            case "age":
                return person -> System.out.println(person.age);
            case "name":
                return person -> System.out.println(person.name);
            default:
                throw new IllegalArgumentException("Invalid print format");
        }
    }

    private static Predicate<Person> getPredicate(int ageFilter, String ageCondition) {    //условие за филтрирането .filter(~)
        switch (ageCondition) {
            case "younger":
                return person -> person.age <= ageFilter;
            case "older":
                return person -> person.age >= ageFilter;
            default:
                throw new IllegalArgumentException("Invalid parameters!");

        }
    }

    private static List<Person> filterByAge(List<Person> people, Predicate<Person> predicate) {
        return people.stream().filter(predicate).collect(Collectors.toList());
    }
}
