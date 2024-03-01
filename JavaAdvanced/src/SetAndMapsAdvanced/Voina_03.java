package SetAndMapsAdvanced;

import java.util.*;

public class Voina_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int [] firstDek = Arrays.stream(scanner.nextLine().split(" "))
                  .mapToInt(Integer::parseInt)
                  .toArray();

        int [] secondDek = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<Integer> dekOne = new LinkedHashSet<>();
        Set<Integer> dekTwo = new LinkedHashSet<>();

         fielSet(firstDek,dekOne);
         fielSet(secondDek,dekTwo);
        int step = 1;
        for (int i = 1; i <= 50; i++) {
            Integer cardOne = dekOne.iterator().next();
            Integer cardTwo = dekTwo.iterator().next();
            dekOne.remove(cardOne);
            dekTwo.remove(cardTwo);
            if (cardOne > cardTwo) {
                dekOne.add(cardOne);
                dekOne.add(cardTwo);
            } else if (cardTwo > cardOne) {
                dekTwo.add(cardOne);
                dekTwo.add(cardTwo);
            }
        }
        if (dekOne.size() < dekTwo.size()) {
            System.out.println("Second player win!");
        } else if (dekTwo.size() < dekOne.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }


    }

    private static void fielSet(int[] firstDek, Set<Integer> dekOne) {
        for (int digit : firstDek) {
            dekOne.add(digit);
        }
    }


}
