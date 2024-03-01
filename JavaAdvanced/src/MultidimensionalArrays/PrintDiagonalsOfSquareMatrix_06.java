package MultidimensionalArrays;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        String [][]matrix = new String[nLine][nLine];

        for (int i = 0; i < nLine; i++) {
            String[] data = scanner.nextLine().split(" ");
            matrix[i] = data;
        }

        for (int i = 0; i < matrix.length; i++) { // ot lqvo goren do desen dolen
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = matrix.length-1; i>=0  ; i--) { // ot lqvo dolno do dqsno gore

            System.out.print(matrix[i][count++] + " ");

        }

    }
}
