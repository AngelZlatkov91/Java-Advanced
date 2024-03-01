package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int countNumbers = numbers1.size();
        Function<List<Integer>, Integer> sumElements = list -> {
            int sum = 0;
            for (int n : list) {
                sum += n;
            }
            return sum;
        };
        int sum = sumElements.apply(numbers1);
        System.out.println("Count = " + countNumbers);
        System.out.println("Sum = " + sum);

    }
}
