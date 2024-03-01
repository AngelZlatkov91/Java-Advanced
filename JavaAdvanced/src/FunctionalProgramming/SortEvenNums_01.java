package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNums_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // не фукционално решение
    /*    List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int num : numbers) {
            if (num % 2 ==0) {
                System.out.print(num + " ");
            }
        }
        Collections.sort(numbers);
        for (int num : numbers) {
            if (num % 2 ==0) {
                System.out.print(num + " ");
            }
        }
      */
        //Функционално прорамиране

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n ->n%2==0)
                .collect(Collectors.toList());
          // 1 nachin
      /*  numbers1.forEach(e -> System.out.print(e + ", "));
          Collections.sort(numbers1);
        System.out.println();
        numbers1.forEach(e -> System.out.print(e + ", "));
         */
          // 2 nachin
        System.out.println(numbers1.stream().map(e -> e+ "").collect(Collectors.joining(", ")));
        System.out.println(numbers1.stream().sorted().map(e-> e+"").collect(Collectors.joining(", ")));

    }
}
