package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] symbols = scanner.nextLine().split(" ");
            firstMatrix[i] = symbols;
        }
        String[][] secondMatrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] symbols = scanner.nextLine().split(" ");
            secondMatrix[i] = symbols;
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (!firstMatrix[i][j].equals(secondMatrix[i][j])) {
                    firstMatrix[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
