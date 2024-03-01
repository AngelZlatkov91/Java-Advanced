package MidExams;

import java.util.*;

public class ItsChocolateTime_01_25June22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] milk = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        double [] cacao = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();


        Map<String,Integer> chocolateTypes = new TreeMap<>();
        chocolateTypes.put("Baking Chocolate",0);
        chocolateTypes.put("Dark Chocolate",0);
        chocolateTypes.put("Milk Chocolate",0);


    ArrayDeque<Double> milkQuantity = new ArrayDeque<>();// Queue
    ArrayDeque<Double>cacaoPowder = new ArrayDeque<>();// Stack

        for (double n : milk) {
            milkQuantity.offer(n);
        }
        for (double n : cacao) {
            cacaoPowder.push(n);
        }

        while (!milkQuantity.isEmpty()) {
            if (cacaoPowder.isEmpty()){
                break;
            }
            double currentPowder =   cacaoPowder.peek() / (milkQuantity.peek() + cacaoPowder.peek()) * 100;
             if (currentPowder == 30) {
              milkQuantity.poll();
              cacaoPowder.pop();
              int currentCount = chocolateTypes.get("Milk Chocolate");
              chocolateTypes.put("Milk Chocolate",currentCount+1);

             } else if (currentPowder == 50) {
                 milkQuantity.poll();
                 cacaoPowder.pop();
                 int currentCount = chocolateTypes.get("Dark Chocolate");
                 chocolateTypes.put("Dark Chocolate",currentCount+1);

             } else if (currentPowder == 100) {
                 milkQuantity.poll();
                 cacaoPowder.pop();
                 int currentCount = chocolateTypes.get("Baking Chocolate");
                 chocolateTypes.put("Baking Chocolate",currentCount+1);
             } else {
                 cacaoPowder.pop();
                 milkQuantity.offer(milkQuantity.poll() + 10);
             }
        }
        boolean allTypes = false;
        for (Map.Entry<String, Integer> entry : chocolateTypes.entrySet()) {
            int allChocolate = entry.getValue();
            if (allChocolate == 0){
                allTypes = true;
                break;
            }
        }
        if (allTypes) {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        } else {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }
        for (Map.Entry<String, Integer> entry : chocolateTypes.entrySet()) {
            String nameMilk = entry.getKey();
            int count = entry.getValue();
            if (count != 0){
                System.out.println("# " + nameMilk + " --> " + count);
            }
        }


    }
}
