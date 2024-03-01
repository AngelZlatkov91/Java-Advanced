package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> toBinary = new ArrayDeque<>(); //Stack
        if (num == 0) {
            System.out.println(0);
            return;
        }

        while (num >0) {
            int n = num % 2;
            num = num /2;
            toBinary.push(n);

        }
        while (!toBinary.isEmpty()) {

            System.out.print(toBinary.pop());
        }



    }
}
