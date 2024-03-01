package MultidimensionalArrays;
import java.util.Scanner;

public class FindTheRealQueen_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] ches = new String[8][8];
        for (int i = 0; i < ches.length; i++) {
            String[] line = scanner.nextLine().split(" ");
            ches[i] = line;
        }
        int currentRow = -1;
        int currentCol = -1;
        for (int row = 0; row < ches.length; row++) {
            for (int col = 0; col < ches[row].length; col++) {
                if (ches[row][col].equals("q")) {










                }
            }
        }

        System.out.println(currentRow + " " + currentCol);

    }
}
