package StacksAndQueues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] names = scanner.nextLine().split(" ");
        int steps = Integer.parseInt(scanner.nextLine());


        PriorityQueue<String> namesQueue = new PriorityQueue<>();
        // Queue подреждане от ниско към високо и сортирани от A-Z
        Collections.addAll(namesQueue,names);
         int currentSteps = 1;
        while (namesQueue.size() > 1) {
            for (int i = 1; i < steps ; i++) {

                String kid = namesQueue.poll();
                namesQueue.offer(kid);
            }
            if (isPrime (currentSteps)) {
                System.out.println("Prime " + namesQueue.peek());
            } else {

                String removedChild = namesQueue.poll();
                System.out.println("Removed " + removedChild);
            }
            currentSteps++;

        }

        System.out.println("Last is " + namesQueue.poll());




    }

    private static boolean isPrime(int currentSteps) {
        if (currentSteps == 1) {
            return false;
        }
        for (int i = 2; i < currentSteps ; i++) {
            if (currentSteps % i == 0) {
                return false;
            }
        }
        return true;

    }
}
