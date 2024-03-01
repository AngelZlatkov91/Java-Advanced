package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String [] data = scanner.nextLine().split(", ");
       int rows = Integer.parseInt(data[0]);
       String tape = data[1];
       int [][] matrix = new int[rows][rows];
       if (tape.equals("A")) {
          fillMatrixPatternA(matrix);
       } else if (tape.equals("B")) {
           fillMatrixPatternB(matrix);
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

    private static void fillMatrixPatternB(int[][] matrix) {
        int startNUm = 1;
        for (int i = 0; i < matrix.length; i++) {
            if ((i+1) % 2 ==0) {
                for (int j = matrix.length-1; j >=0 ; j--) {
                       matrix[j][i] = startNUm;
                       startNUm++;
                }

            } else {
                for (int j = 0; j <= matrix.length-1 ; j++) {
                    matrix[j][i] = startNUm;
                    startNUm++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int [][]matrix) {
        int starNum = 1;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                matrix[j][i] = starNum;
                starNum++;
            }
        }
    }


}
