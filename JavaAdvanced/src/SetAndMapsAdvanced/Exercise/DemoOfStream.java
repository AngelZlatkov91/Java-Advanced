package SetAndMapsAdvanced.Exercise;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;

public class DemoOfStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Double>> studentGrade = new HashMap<>();
          studentGrade.put("Angel",new ArrayList<>());
          studentGrade.get("Angel").add(2.50);
          studentGrade.get("Angel").add(4.50);
          studentGrade.get("Angel").add(3.20);
          studentGrade.get("Angel").add(2.50);

        studentGrade.put("Zlatkov",new ArrayList<>());

        studentGrade.get("Zlatkov").add(10.0);
        studentGrade.get("Zlatkov").add(6.0);

       studentGrade.entrySet().stream()
               .sorted((s1, s2) -> s2.getValue().size() - s1.getValue().size());


        studentGrade.entrySet().stream().sorted(comparingByKey());
        studentGrade.entrySet().stream().sorted(Collections.reverseOrder(comparingByKey()));

        System.out.println();


    }

}
