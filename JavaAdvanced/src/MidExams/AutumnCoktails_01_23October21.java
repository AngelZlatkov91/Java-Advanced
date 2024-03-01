package MidExams;
import java.util.*;

public class AutumnCoktails_01_23October21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> ingredients.offer(Integer.valueOf(e)));


        ArrayDeque<Integer> freshness = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> freshness.push(Integer.valueOf(e)));


      Map<String,Integer> cocktail = new TreeMap<>();
      cocktail.put("Pear Sour",0);
      cocktail.put("The Harvest",0);
      cocktail.put("Apple Hinny",0);
      cocktail.put("High Fashion",0);
        while (!ingredients.isEmpty()) {
            if (freshness.isEmpty()) {
                break;
            }
            if (ingredients.peek() ==0){
                ingredients.poll();
                continue;
            }
            int currentCoktel = ingredients.peek() * freshness.peek();
            if (currentCoktel == 150) {
                int currentCount = cocktail.get("Pear Sour");
                cocktail.put("Pear Sour", currentCount+1);
                ingredients.poll();
                freshness.pop();

            } else if (currentCoktel == 250) {
                int currentCount = cocktail.get("The Harvest");
                cocktail.put("The Harvest", currentCount+1);
                ingredients.poll();
                freshness.pop();
            } else if (currentCoktel == 300) {
                int currentCount = cocktail.get("Apple Hinny");
                cocktail.put("Apple Hinny", currentCount+1);
                ingredients.poll();
                freshness.pop();
            } else if (currentCoktel == 400) {
                int currentCount = cocktail.get("High Fashion");
                cocktail.put("High Fashion", currentCount+1);
                ingredients.poll();
                freshness.pop();
            } else {
                freshness.pop();
                ingredients.offer(ingredients.poll() + 5);
            }

        }
        boolean isNotAll = false;
        for (Map.Entry<String, Integer> entry : cocktail.entrySet()) {
            int count = entry.getValue();
            if (count == 0) {
                isNotAll = true;
                break;
            }
        }
        if (isNotAll) {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        } else {
            System.out.println("It's party time! The cocktails are ready!");
        }
        if (!ingredients.isEmpty()) {
            int sum = 0;
            for (int n : ingredients) {
                sum += n;
                ingredients.poll();
            }
            System.out.println("Ingredients left: " + sum);
        }
        for (Map.Entry<String, Integer> entry : cocktail.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count != 0) {
                System.out.printf("# %s --> %d%n", name, count);
            }
        }


    }
}
