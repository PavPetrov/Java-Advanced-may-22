import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> partyPeople = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] commandsParts = input.split(" ");
            String command = commandsParts[0];
            Predicate<String> predicate = getPredicate(commandsParts);
            switch (command) {
                case "Double":
                    List<String> peopleToAdd = new LinkedList<>();
                    partyPeople.stream().filter(predicate).forEach(p -> peopleToAdd.add(p));
                    partyPeople.addAll(peopleToAdd);
                    break;
                case "Remove":
                    partyPeople.removeIf(predicate);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }

            input = scanner.nextLine();
        }

        if(partyPeople.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            Collections.sort(partyPeople);
            System.out.println(String.join(", ", partyPeople) + " are going to the party!");
        }
    }

    public static Predicate<String> getPredicate(String[] commandParts) {
        Predicate<String> predicate;

        String filter = commandParts[1];
        String criteria = commandParts[2];

        switch (filter) {
            case "StartsWith":
                return name -> name.startsWith(criteria);
            case "EndsWith":
                return name -> name.endsWith(criteria);
            case "Length":
                return name -> name.length() == Integer.parseInt(criteria);
            default:
                throw new IllegalArgumentException();
        }
    }
}
