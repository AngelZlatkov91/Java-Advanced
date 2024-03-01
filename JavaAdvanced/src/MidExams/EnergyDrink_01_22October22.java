package MidExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrink_01_22October22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] caf = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int [] enDrinks = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> caffeine = new ArrayDeque<>(); // Stack
        ArrayDeque<Integer> energyDrinks = new ArrayDeque<>(); // Queue

        for (int n : caf) {
            caffeine.push(n);
        }
        for (int n: enDrinks) {
            energyDrinks.offer(n);
        }

        int caffeineLeft = 300;
        int startCaffeine = 0;

          while (!caffeine.isEmpty()) {
              if (energyDrinks.isEmpty()) {
                  break;
              }
              int currentEnergy = energyDrinks.peek();
              int maxCaffeine = caffeine.pop() * energyDrinks.poll();
              if (caffeineLeft >= maxCaffeine) {
                  caffeineLeft -= maxCaffeine;
                  startCaffeine += maxCaffeine;
              } else {
                  energyDrinks.offer(currentEnergy);
                  if ((startCaffeine - 30) >=0) {
                      startCaffeine -= 30;
                  }
                  if ((caffeineLeft + 30) <= 300) {
                      caffeineLeft +=30;
                  }


              }
          }
          if (energyDrinks.isEmpty()) {
              System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
          } else {
              System.out.print("Drinks left: ");
              for (int drink : energyDrinks) {
                  if (energyDrinks.size() == 1) {
                      System.out.print(drink);
                  } else {
                      System.out.print(drink + ", ");
                  }
                  energyDrinks.poll();
              }
              System.out.println();
          }



        System.out.println("Stamat is going to sleep with " + startCaffeine + " mg caffeine.");
    }
}
