import java.sql.SQLOutput;
import java.util.*;

public class P07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        Map<String, Set<String>> personCards = new LinkedHashMap<>();

        while (!inputLine.equals("JOKER")) {
            String[] data = inputLine.split(": ");
            String name = data[0];
            String[] cards = data[1].split(",\\s+");

            personCards.putIfAbsent(name, new LinkedHashSet<>());
            for (String card : cards) {
                personCards.get(name).add(card);
            }

            inputLine = scanner.nextLine();
        }

        for (var entry : personCards.entrySet()) {
            String name = entry.getKey();
            int cardsSum = calculateCards(entry.getValue());
            System.out.println(name + ": " + cardsSum);
        }
    }

    private static int calculateCards(Set<String> cards) {
        int sum = 0;
        for (String card : cards) {
            String cardPower = card.substring(0, card.length() - 1);
            char cardType = card.charAt(card.length() - 1);
            sum += getCardPoints(cardPower, cardType);
        }
        return sum;
    }

    private static int getCardPoints(String cardPower, char cardType) {
        int multiplier = 0;
        switch (cardType) {
            case 'S':
                multiplier = 4;
                break;
            case 'H':
                multiplier = 3;
                break;
            case 'D':
                multiplier = 2;
                break;
            case 'C':
                multiplier = 1;
                break;
        }
        switch (cardPower) {
            case "J":
                return 11 * multiplier;

            case "Q":
                return 12 * multiplier;

            case "K":
                return 13 * multiplier;

            case "A":
                return 14 * multiplier;

            default:
                return Integer.parseInt(cardPower) * multiplier;
        }
    }
}
