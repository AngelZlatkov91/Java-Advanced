package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Crossfire_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String [][] matrix = new String[digits[0]][digits[1]];
        int count = 1;
        fillMatrix(matrix, count);


        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int row = Integer.parseInt(input.split(" ")[0]);
            int col = Integer.parseInt(input.split(" ")[1]);
            int radius = Integer.parseInt(input.split(" ")[2]);
            int diffLeftCol = col - radius;
            int diffRightCol = col + radius;
            int diffUpRow = row - radius;
            int diffDownRow = row + radius;
           if (diffLeftCol <0) {
               diffLeftCol = 0;
           }
           if (diffRightCol > matrix.length-1) {
               diffRightCol = matrix[row].length;
           }
           if (diffUpRow < 0) {
               diffUpRow = 0;
           }
           if (diffDownRow > matrix.length-1) {
               diffDownRow = matrix.length;
           }
            for (int i = diffLeftCol; i <diffRightCol ; i++) {
                matrix[row][i] = null;
            }
            for (int i = diffUpRow; i < diffDownRow; i++) {
                matrix[i][col] = null;
            }

            input = scanner.nextLine();
        }


        printMatrix(matrix);


    }

    private static void printMatrix(String [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] !=(null)) {
                    if (j == matrix[i].length - 1) {
                        System.out.print(matrix[i][j]);
                    } else {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, int count) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String digit = "" + count + "";
                matrix[i][j] = digit;
                        count++;
            }
        }
    }
}
