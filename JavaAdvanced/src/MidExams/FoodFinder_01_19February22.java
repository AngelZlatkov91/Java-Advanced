package MidExams;
import java.util.*;
import java.util.stream.Collectors;

public class FoodFinder_01_19February22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] product = new String[] {"pear","flour","pork","olive"};
        String [] foundWords = new String[] {"****","*****","****","*****"};


        ArrayDeque<Character> vowelsQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> vowelsQueue.offer(e.charAt(0)));


        ArrayDeque<Character> consonantsStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> consonantsStack.offer(e.charAt(0)));

        while (!consonantsStack.isEmpty()) {
            char symbolVowels = vowelsQueue.poll();
            char symbolConsonan = consonantsStack.pop();
            for (int i = 0; i < product.length; i++) {
                String currentProduct = product[i];
               int indexVowels = currentProduct.indexOf(symbolVowels);
               int indexConsonan = currentProduct.indexOf(symbolConsonan);
               if (indexVowels >= 0) {
                   foundWords[i] = foundWords[i].substring(0, indexVowels) + symbolVowels + foundWords[i].substring(indexVowels + 1);
               }
               if (indexConsonan >=0) {
                   foundWords[i] = foundWords[i].substring(0, indexConsonan) + symbolConsonan + foundWords[i].substring(indexConsonan + 1);
               }
            }
            vowelsQueue.offer(symbolVowels);
        }
        List<String> words  = Arrays.stream(foundWords).filter(w -> !w.contains("*")).collect(Collectors.toList());

        System.out.printf("Words found: %d%n", words.size());
        words.forEach(System.out::println);




    }
}
