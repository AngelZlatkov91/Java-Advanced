package SetAndMapsAdvanced;

import java.util.*;

public class AverageStrudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> dataForStudents = new TreeMap<>();
        for (int i = 0; i < nLine; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            double average = Double.parseDouble(data[1]);
            if (!dataForStudents.containsKey(name)) {
                dataForStudents.put(name, new ArrayList<>());
            }
            dataForStudents.get(name).add(average);
        }

        for (Map.Entry<String, List<Double>> entry : dataForStudents.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            double allSum = 0;
            for (double digit : entry.getValue()) {
                System.out.printf("%.2f ",digit);
                allSum +=digit;
            }
            System.out.printf("(avg: %.2f)%n",allSum / entry.getValue().size());
        }


    }
}
