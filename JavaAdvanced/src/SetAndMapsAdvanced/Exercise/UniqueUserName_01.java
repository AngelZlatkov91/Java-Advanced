package SetAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUserName_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
          Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < nLine; i++) {
            String words = scanner.nextLine();
            names.add(words);
        }
        names.forEach(System.out::println);


    }
}
