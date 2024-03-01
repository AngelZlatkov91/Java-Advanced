package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printQue = new ArrayDeque<>();//Queue
        String input = scanner.nextLine();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                String firstTask = printQue.poll();
                if (firstTask == null) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + firstTask);
                }
            } else {
                printQue.offer(input);
            }



            input = scanner.nextLine();
        }
        while (!printQue.isEmpty()) {
            System.out.println(printQue.poll());
        }



    }
}
