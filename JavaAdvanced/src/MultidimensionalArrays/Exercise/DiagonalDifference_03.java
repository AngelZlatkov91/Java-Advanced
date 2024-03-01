package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        int [][]matrix = new int[nLine][nLine];

        fillMatrix(scanner, matrix);
       int sumPrimary = getSumPrimer(matrix);

       int sumSecondary = getSumSecondary(matrix);

        System.out.println(Math.abs(sumPrimary - sumSecondary));

    }

    private static int getSumSecondary(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = matrix.length-1; i>=0  ; i--) {
            sum +=matrix[i][count++];

        }



        return sum;

    }

    private static int getSumPrimer(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }


        return sum;
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <matrix.length ; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
