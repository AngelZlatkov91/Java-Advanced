package SetAndMapsAdvanced;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Double>> productShop = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String[] data = input.split(", ");
            String magazine = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);
            if (!productShop.containsKey(magazine)) {
                productShop.put(magazine,new LinkedHashMap<>());
            }
            productShop.get(magazine).put(product,price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> entry : productShop.entrySet()) {
            String magazine = entry.getKey();
            System.out.println(magazine + "->");
            for (Map.Entry<String, Double> stringDoubleEntry : entry.getValue().entrySet()) {
                String product = stringDoubleEntry.getKey();
                double price = stringDoubleEntry.getValue();
                System.out.printf("Product: %s, Price: %.1f%n",product,price);
            }

        }


    }
}
