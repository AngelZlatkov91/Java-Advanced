package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> reverseNumbers = new ArrayDeque<>();
        for (int num : digits) {
            reverseNumbers.push(num);
        }
        while (!reverseNumbers.isEmpty()) {
            System.out.print(reverseNumbers.pop() + " ");
        }








    }
}
