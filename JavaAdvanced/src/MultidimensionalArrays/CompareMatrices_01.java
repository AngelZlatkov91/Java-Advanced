package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] data = Arrays.stream(scanner.nextLine().split(" "))
                 .mapToInt(Integer::parseInt)
                 .toArray();

         int row = data[0];
         int col = data[1];
         int [][] firstMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            firstMatrix[i] = digits;
        }
        data = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = data[0];
        int cols = data[1];
        int [][] secondMatrix = new int[rows][cols];
        for (int i = 0; i < row; i++) {
            int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            secondMatrix[i] = digits;
        }


        if (isEqual(firstMatrix,secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }
    private static boolean isEqual (int[][] firstMatrix, int [][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            if (firstMatrix[i].length != secondMatrix[i].length) {
                return false;
            }
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    return  false;
                }
            }
        }
        return true;
    }
}
