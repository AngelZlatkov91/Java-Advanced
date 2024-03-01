package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Matrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] data = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = data[0];
        int col = data[1];
        int [][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int [] digits = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = digits;
        }
        int maxSum = 0;
        int row1 = 0;
        int col1 = 0;
        int row2 = 0;
        int col2 = 0;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                int currentSum = matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];
             if (currentSum > maxSum ) {
                 maxSum = currentSum;
                 row1 = matrix[i][j];
                 col1 = matrix[i][j+1];
                 row2 = matrix[i+1][j];
                 col2 = matrix[i+1][j+1];
             }
            }
        }
        System.out.println(row1 + " " + col1);
        System.out.println(row2 + " " + col2);
        System.out.println(maxSum);


    }
}
