import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> VIP = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        while (!input.equals("PARTY")) {

            if (Character.isDigit(input.charAt(0))) {
                VIP.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        TreeSet<String> allGuest = new TreeSet<>(VIP);
        allGuest.addAll(regular);

        while (!input.equals("END")) {
            allGuest.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(allGuest.size());
        System.out.println(String.join(System.lineSeparator(), allGuest));

    }
}
