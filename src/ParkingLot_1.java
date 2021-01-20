import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParkingLot_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashSet<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String registrationNumber = tokens[1];
            switch (tokens[0]) {
                case "IN":
                    parking.add(registrationNumber);
                    break;
                case "OUT":
                    parking.remove(registrationNumber);
                    break;
            }
            input = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), parking));
        }
        parking.stream()
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
