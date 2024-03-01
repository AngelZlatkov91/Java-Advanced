package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// брой на елементите
        int s = scanner.nextInt(); // брой на елементите който трябва да се махнат
        int x = scanner.nextInt(); // число на което се проверява дали го има
        ArrayDeque<Integer> queue = new ArrayDeque<>();// Stack
        for (int i = 1; i <=n ; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 1; i <=s ; i++) {
            queue.poll();
        }
        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                // ako go nqma printira naj malkiat element
                System.out.println(Collections.min(queue));
            }
        }





    }
}
