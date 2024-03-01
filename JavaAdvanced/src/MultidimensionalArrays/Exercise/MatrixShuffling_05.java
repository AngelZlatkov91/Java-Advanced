package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[][] matrix = new String[digits[0]][digits[1]];
        fillMatrix(scanner,matrix);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
             if (validCommand(input,digits[0],digits[1])) {
                 String [] command = input.split("\\s+");
                 int row1 = Integer.parseInt(command[1]);
                 int col1 =Integer.parseInt(command[2]);
                 int row2 =Integer.parseInt(command[3]);
                 int col2 =Integer.parseInt(command[4]);
                 String firstElement = matrix[row1][col1];
                  String secondElement = matrix[row2][col2];
                 matrix[row1][col1] = secondElement;
                 matrix[row2][col2] = firstElement;
                 printMatrix(matrix);
             } else {
                 System.out.println("Invalid input!");
             }

            input = scanner.nextLine();
        }
    }
    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean validCommand (String input,int rows, int cols) {
        String [] commandParts = input.split("\\s+");
        //проверка на дължина
        if (commandParts.length != 5) {
            return false;
        }
        // проверка дали съдържа дъмата swap
        if (!commandParts[0].equals("swap")) {
            return false;
        }
        // проверка на валидни индекси
        int row1 = Integer.parseInt(commandParts[1]);
        int col1 =Integer.parseInt(commandParts[2]);
        int row2 =Integer.parseInt(commandParts[3]);
        int col2 =Integer.parseInt(commandParts[4]);
           if (row1 <0 || row1 >= rows || row2 <0 || row2 >= rows || col1 <0 || col1 >= cols || col2 <0 || col2 >= cols) {
               return false;
           }
           return true;

    }
    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
