package StacksAndQueues.Exercise;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> maximumElement = new ArrayDeque<>();// Stack
        for (int i = 1; i <=nLine ; i++) {
            String commands = scanner.nextLine();
            if (commands.equals("2")) {
                if (!maximumElement.isEmpty()) {
                    maximumElement.pop();
                }
            } else if (commands.equals("3")) {
                System.out.println(Collections.max(maximumElement));
            } else {
                int digit = Integer.parseInt(commands.split(" ")[1]);
                maximumElement.push(digit);
            }
        }
    }

}
