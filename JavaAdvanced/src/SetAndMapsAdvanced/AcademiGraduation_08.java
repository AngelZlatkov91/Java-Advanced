package SetAndMapsAdvanced;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademiGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
        Map<String,Double[]> gradePerStudent = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] inputGrades = scanner.nextLine().split(" ");
            Double[] grades = new Double[inputGrades.length];
            for (int j = 0; j < inputGrades.length; j++) {
                grades[j] = Double.parseDouble(inputGrades[j]);
            }
            gradePerStudent.put(name,grades);
        }
        for (String name : gradePerStudent.keySet()) {
            Double[] grades = gradePerStudent.get(name);
            double average = 0;
            for (double digit : grades) {
                average += digit;
            }
            average = average / grades.length;
            DecimalFormat format = new DecimalFormat("0.#########");

            System.out.printf("%s is graduated with %s%n",name,format.format(average));
        }




    }
}
