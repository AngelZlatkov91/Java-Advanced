package MidExams;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class ApocapypsePreparation_01_18Feb23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] textiles = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int [] medicaments = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> textileStack = new ArrayDeque<>();//Queue
        ArrayDeque<Integer> medicamenQueue = new ArrayDeque<>();//Stack
        for (int digit : textiles) {
            textileStack.offer(digit);
        }
        for (int digit : medicaments) {
            medicamenQueue.push(digit);
        }
        Map<String,Integer> items = new HashMap<>();
        items.put("Patch",0);
        items.put("Bandage",0);
        items.put("MedKit",0);
        int patch = 30;
        int bandage = 40;
        int medKit = 100;
        int last = 0;
        while (!textileStack.isEmpty()) {
            if (medicamenQueue.isEmpty()) {
                break;
            }
            int currentPrice = textileStack.peek() + medicamenQueue.peek() + last;
            if (currentPrice == patch) {
                textileStack.poll();
                medicamenQueue.pop();
                int currentCount = items.get("Patch");
                items.put("Patch",currentCount+1);
            } else if (currentPrice == bandage) {
                textileStack.poll();
                medicamenQueue.pop();
                int currentCount = items.get("Bandage");
                items.put("Bandage",currentCount+1);
            } else if (currentPrice == medKit) {
                textileStack.poll();
                medicamenQueue.pop();
                int currentCount = items.get("MedKit");
                items.put("MedKit",currentCount+1);
            } else if (currentPrice > medKit) {
               last = currentPrice - medKit;
                textileStack.poll();
                medicamenQueue.pop();
                int currentCount = items.get("MedKit");
                items.put("MedKit",currentCount+1);
            } else {
                last = 10;
                textileStack.poll();
            }

        }
        if (textileStack.isEmpty() && medicamenQueue.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");

        } else {
            if (textileStack.isEmpty()) {
                System.out.println("Textiles are empty.");
            } else {
                System.out.println("Medicaments are empty.");
            }
        }

        List<Map.Entry<String, Integer>> orderedItems =
                new ArrayList<>(items.entrySet());
        Collections.sort(orderedItems,
                Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().
                        thenComparing(Map.Entry<String, Integer>::getKey));

        for (Map.Entry<String, Integer> item : orderedItems) {
            if (item.getValue() != 0) {
                System.out.println(item.getKey() + " - " + item.getValue());
            }
        }
         if (!medicamenQueue.isEmpty()) {
             System.out.print("Medicaments left: ");
             for (int digit : medicamenQueue) {
                 if (medicamenQueue.size() == 1) {
                     System.out.print(digit);
                 } else {
                     System.out.print(digit + ", ");
                 }
                 medicamenQueue.pop();
             }
         }

         if (!textileStack.isEmpty()) {
             System.out.print("Textiles left: ");
             for (int digit : textileStack) {
                 if (textileStack.size()==1) {
                     System.out.print(digit);
                 } else {
                     System.out.print(digit + ", ");
                 }
                 textileStack.poll();
             }
         }
    }
}
