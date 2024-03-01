package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] data = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = data[0];
        int col = data[1];
        int sum = 0;

        for (int i = 0; i < row; i++) {
            int [] digits = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int digit : digits) {
                 sum += digit;
            }
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);


    }
}
