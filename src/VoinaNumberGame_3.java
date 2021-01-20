import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VoinaNumberGame_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds-- > 0 && !firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            Integer firstCards = firstDeck.iterator().next();
            firstDeck.remove(firstCards);
            Integer secondCards = secondDeck.iterator().next();
            secondDeck.remove(secondCards);

            if (firstCards > secondCards) {
                firstDeck.add(firstCards);
                firstDeck.add(secondCards);
            } else if (secondCards > firstCards) {
                secondDeck.add(firstCards);
                secondDeck.add(secondCards);
            }
        }

        if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (secondDeck.size() > firstDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
