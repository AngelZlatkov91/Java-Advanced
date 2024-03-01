package FunctionalProgramming;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CoubtUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Predicate<String> isUpperCase = word ->Character.isUpperCase(word.charAt(0));
        words = words.stream().filter(isUpperCase).collect(Collectors.toList());
        System.out.println(words.size());
        System.out.println(String.join("\n",words));
    }
}
