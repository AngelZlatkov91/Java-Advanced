package SetAndMapsAdvanced;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
public class Demo {
    public static void main(String[] args) {
        Map<String,Integer> asd = new LinkedHashMap<>();
        asd.put("gosho", 2);
        asd.put("as", 3);
        asd.put("angel", 2);
        asd.put("oleg", 5);

        asd.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
