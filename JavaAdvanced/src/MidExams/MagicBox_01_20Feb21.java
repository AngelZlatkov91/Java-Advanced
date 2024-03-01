package MidExams;

import java.util.*;

public class MagicBox_01_20Feb21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> firstBox.offer(Integer.valueOf(e)));


        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> secondBox.push(Integer.valueOf(e)));
        int allSum = 0;
         while (!firstBox.isEmpty()) {
             if (secondBox.isEmpty()) {
                 break;
             }
             int currentFirsBox = firstBox.peek();
             int currentSecondBox = secondBox.peek();
             int sum = currentFirsBox + currentSecondBox;
             if (sum % 2 == 0) {
                 allSum += sum;
                 firstBox.poll();
                 secondBox.pop();
             } else {
                 secondBox.pop();
                 firstBox.offer(currentSecondBox);
             }
         }
         if (firstBox.isEmpty()) {
             System.out.println("First magic box is empty.");
         } else {
             System.out.println("Second magic box is empty.");
         }

        if (allSum >= 90) {
            System.out.println("Wow, your prey was epic! Value: " + allSum);
        } else {
            System.out.println("Poor prey... Value: " + allSum);
        }







    }
}
