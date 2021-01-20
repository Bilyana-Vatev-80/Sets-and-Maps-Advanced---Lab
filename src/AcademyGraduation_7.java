import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> studentsGrades = new TreeMap<>();

        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            studentsGrades.put(name, grades);
        }
        studentsGrades.forEach((k, v) -> {
            double average = 0;
            for (Double aDouble : v) {
                average += aDouble;
            }
            average /= v.length;
            System.out.printf("%s is graduated with %s%n", k, average);
        });

    }
}
