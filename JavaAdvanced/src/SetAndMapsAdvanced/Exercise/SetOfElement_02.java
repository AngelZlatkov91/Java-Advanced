package SetAndMapsAdvanced.Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOfElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputDigits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        //[0] - firstSet
        //[1] - secondSet
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <= inputDigits[0]; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            firstSet.add(value);
        }
        for (int i = 1; i <= inputDigits[1]; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);
        }
        firstSet.retainAll(secondSet);// premaxva vsichki elementi koito gi niama v vtoriat set
        firstSet.forEach(e -> System.out.print(e + " "));
    }
}
