import java.util.*;
import java.util.stream.Collectors;

public class P03_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   Set<Integer> player1Deck = new LinkedHashSet<>();
        Set<Integer> player2Deck = new LinkedHashSet<>();

        Set<Integer> player1Deck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
       /* int[] deck1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int card : deck1) {
            player1Deck.add(card);
        }*/
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(player2Deck::add);
        System.out.println();
        int rounds = 0;

        System.out.println();
        while (!player1Deck.isEmpty() || !player2Deck.isEmpty()) {
            rounds++;
            int firstPlayerCard = player1Deck.iterator().next();
            player1Deck.remove(firstPlayerCard);

            int secondPlayerCard = player2Deck.iterator().next();
            player2Deck.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                player1Deck.add(firstPlayerCard);
                player1Deck.add(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard) {
                player2Deck.add(firstPlayerCard);
                player2Deck.add(secondPlayerCard);
            } else {
                // draw case ???
            }
            if (rounds == 50){
                break;
            }

        }

        if (player1Deck.size() > player2Deck.size()) {
            System.out.println("First player win!");
        } else if (player1Deck.size() < player2Deck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
