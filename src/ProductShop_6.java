import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        Map<String, Map<String, Double>> costs = new TreeMap<>();

        while (!"Revision".equals(input = scanner.nextLine())) {
            String[] tokens = input.split(", ");
            String shops = tokens[0];
            String products = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            costs.putIfAbsent(shops, new LinkedHashMap<>());
            costs.get(shops).put(products, price);
        }
        costs.entrySet()
                .stream()
                .forEach(e -> {
                    System.out.println(e.getKey() + "->");
                    e.getValue().entrySet()
                            .stream()
                            .forEach(innerEntry -> {
                                System.out.printf("Product: %s, Price: %.1f%n", innerEntry.getKey(), innerEntry.getValue());
                            });
                });
    }
}
