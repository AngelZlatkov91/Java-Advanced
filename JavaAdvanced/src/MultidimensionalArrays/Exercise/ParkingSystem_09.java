package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingSystem_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[][] parking = new String[digits[0]][digits[1]];
        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {
                parking[i][j]  = " ";
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int rowIn = Integer.parseInt(input.split(" ")[0]);
            int row = Integer.parseInt(input.split(" ")[1]);
            int col = Integer.parseInt(input.split(" ")[2]);
            int countMovies = 1;
            if (rowIn <= row){
                countMovies += row - rowIn;
            } else {
                countMovies += rowIn-row;
            }
            if (parking[row][col].equals(" ")) {
                countMovies += col;
                parking[row][col] = "car";
                System.out.println(countMovies);
            } else {
                boolean isFull = true;
                for (int i = 1; i < parking[row].length; i++) {
                    countMovies++;
                    if (parking[row][i].equals(" ")) {
                        parking[row][i] = "car";
                        isFull= false;
                        break;
                    }
                }
                if (isFull) {
                    System.out.println("Row " + row + " full");
                }
            }

            input = scanner.nextLine();
        }



    }
}
