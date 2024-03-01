package MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowAndCol = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String [][] matrixPalindrome = new String[rowAndCol[0]][rowAndCol[1]];
        char firstSymbol = 'a';
        char secondSymbol = 'a';
        char thirdSymbol = 'a';
        for (int i = 0; i < matrixPalindrome.length; i++) {
            for (int j = 0; j < matrixPalindrome[i].length; j++) {
                String word = firstSymbol + "" +secondSymbol + "" + thirdSymbol;
                matrixPalindrome[i][j]=word;
                secondSymbol++;
            }
            firstSymbol++;
            secondSymbol = firstSymbol;
            thirdSymbol++;
        }

        for (int i = 0; i < matrixPalindrome.length; i++) {
            for (int j = 0; j < matrixPalindrome[i].length; j++) {
                String word = matrixPalindrome[i][j];
                System.out.print(word + " ");
            }
            System.out.println();
        }

    }
}
