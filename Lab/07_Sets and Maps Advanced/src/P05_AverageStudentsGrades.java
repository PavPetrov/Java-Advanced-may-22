import java.util.*;

public class P05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!students.containsKey(name)) {
               /* List<Double> grades = new LinkedList<>();
                grades.add(grade);
                students.put(name,grades);*/
                students.put(name, new LinkedList<>());
            }
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> st : students.entrySet()) {
            System.out.print(st.getKey() + " -> " );
            for (Double grade : st.getValue()) {
                System.out.printf("%.2f ", grade);
            }
            double sum = 0;
            for (Double grade : st.getValue()) {
                sum += grade;
            }
            System.out.printf("(avg: %.2f)%n", sum / st.getValue().size());
           // System.out.printf("(avg: %.2f)%n", st.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble());
        }
    }
}
//Alex -> 2.00 3.00 (avg: 2.50)
//Maria -> 5.50 2.50 3.46 (avg: 3.82)
//Stephan -> 5.20 3.20 (avg: 4.20)