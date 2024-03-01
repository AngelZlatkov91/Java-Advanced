package MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;
public class MaximalSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrix = new int[digits[0]][digits[1]];
        fillMatrix(scanner,matrix);
        int maxSum = 0;
        int [][]firstLine = new int[3][3];
        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[i].length-2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j+1] + matrix [i][j+2]
                        + matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2]
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    firstLine[0][0]=matrix[i][j];
                    firstLine[0][1]=matrix[i][j+1];
                    firstLine[0][2]=matrix [i][j+2];
                    firstLine[1][0]=matrix[i+1][j];
                    firstLine[1][1]=matrix[i+1][j+1];
                    firstLine[1][2]=matrix[i+1][j+2];
                    firstLine[2][0]=matrix[i+2][j];
                    firstLine[2][1]=matrix[i+2][j+1];
                    firstLine[2][2]=matrix[i+2][j+2];
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int i = 0; i < firstLine.length; i++) {
            for (int j = 0; j < firstLine[i].length; j++) {
                System.out.print(firstLine[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = digits;
        }
    }
}
