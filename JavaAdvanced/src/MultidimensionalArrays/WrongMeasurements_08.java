package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r= Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[r][];
        fillMatrix(scanner, r, matrix);

        int[] wrongValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int wrongNum =matrix[wrongValue[0]][wrongValue[1]];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongNum) {
                    int sum = 0;
                    //up
                    if ((row-1)>=0 && matrix[row-1][col] !=wrongNum ) {
                        sum += matrix[row-1][col];
                    }
                    //down
                    if ((row + 1) < matrix.length && matrix[row+1][col] !=wrongNum) {
                        sum += matrix[row+1][col];
                    }
                    if ((col -1) >=0 && matrix[row][col-1] !=wrongNum){
                        sum += matrix[row][col-1];
                    }
                    if ((col + 1) < matrix[row].length && matrix[row][col+1] !=wrongNum){
                        sum += matrix[row][col+1];
                    }
                    matrix[row][col] = sum;

                }
            }
        }
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, int row, int[][] matrix) {
        for (int i = 0; i < row; i++) {
            int [] line = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = line;
        }
    }
}
