package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf_02 {
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
        int foundDigit = Integer.parseInt(scanner.nextLine());
        boolean notFind = true;
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] == foundDigit) {
                    System.out.println(i +" " + j);
                    notFind = false;
                }
            }
        }
        if (notFind) {
            System.out.println("not found");
        }


    }
}
