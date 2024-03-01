package SetAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();


        Map<Double,Integer> countNumbers = new LinkedHashMap<>();
        for (double num : digits) {

            if (!countNumbers.containsKey(num)) {
                countNumbers.put(num,0);
            }
            int currentCount = countNumbers.get(num);
            countNumbers.put(num,currentCount+1);
        }
        for (Map.Entry<Double, Integer> entry : countNumbers.entrySet()) {
            double digit = entry.getKey();
            int count = entry.getValue();
            System.out.printf("%.1f -> %d%n",digit,count);
        }


    }
}
