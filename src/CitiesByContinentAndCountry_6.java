import java.util.*;

public class CitiesByContinentAndCountry_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> diary = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continents = tokens[0];
            String countries = tokens[1];
            String cities = tokens[2];

            diary.putIfAbsent(continents, new LinkedHashMap<>());
            diary.get(continents).putIfAbsent(countries, new ArrayList<>());
            diary.get(continents).get(countries).add(cities);
        }
        diary.forEach((k, v) -> {
            System.out.printf("%s:%n", k);
            v.forEach((f, s) -> {
                System.out.println(f + " -> " + String.join(", ", s));
            });
        });
    }
}
