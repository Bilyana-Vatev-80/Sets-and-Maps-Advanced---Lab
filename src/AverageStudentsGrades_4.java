import java.util.*;

public class AverageStudentsGrades_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsDiary = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String studentName = tokens[0];
            double grades = Double.parseDouble(tokens[1]);
            studentsDiary.putIfAbsent(studentName, new ArrayList<>());
            studentsDiary.get(studentName).add(grades);
        }
        studentsDiary.entrySet()
                .stream()
                .forEach(e -> {
                    double sum = 0;
                    for (int i = 0; i < e.getValue().size(); i++) {
                        sum += e.getValue().get(i);
                    }
                    double avSum = sum / e.getValue().size();
                    System.out.print(e.getKey() + " -> ");
                    e.getValue().forEach(v -> System.out.printf("%.2f ", v));
                    System.out.printf("(avg: %.2f)%n", avSum);
                });
    }
}
