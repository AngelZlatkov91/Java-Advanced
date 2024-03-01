package MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RallyRacing_02Exam22Oct2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());

         String carNumber = scanner.nextLine();
         int km = 0; // izminati km

         String [][] trace = new String[n][n];
         fillMatrix(scanner,trace);
         int countTunels = 0;
         int currentRow = 0; // red koito se namira kolata
        int currentCol = 0;// kolona na koqto se namira kolata
        // tunel 1

        // tunel 2
       // masiv s 4 elem.  - 1 tunel - 0 i 1 ; 2 tunel 2 i 3;
        List<Integer> tunelCordinate = new ArrayList<>();
        findTunnels(trace,tunelCordinate);
        //zapochvame dvijenie
        String direction = scanner.nextLine();

        while (!direction.equals("End")) {

            switch (direction) {

                case "left":
                    currentCol--;
                    break;
                case  "right":
                    currentCol++;
                    break;
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
            }
            String currentPlace = trace[currentRow][currentCol];
            if (currentPlace.equals(".")) {
                km += 10;
            } else if (currentPlace.equals("F")) {
                System.out.printf("Racing car %s finished the stage!%n", carNumber);
                km += 10;
                break;
            } else if (currentPlace.equals("T")) {
                countTunels++;
                if (countTunels == 1) {
                    currentRow = tunelCordinate.get(2);
                    currentCol = tunelCordinate.get(3);
                    km += 30;
                    trace[tunelCordinate.get(0)][tunelCordinate.get(1)] = ".";
                    trace[tunelCordinate.get(2)][tunelCordinate.get(3)] = ".";
                }
            }
            direction = scanner.nextLine();
        }
        if (direction.equals("End")) {
            System.out.printf("Racing car %s DNF.%n",carNumber);

        }
        System.out.printf("Distance covered %d km.%n",km);
        trace[currentRow][currentCol] = "C";
        printMatrix(trace);






    }
    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }

    private static void findTunnels(String[][] trace, List<Integer> tunelCordinate) {
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("T")) {
                    tunelCordinate.add(i);
                    tunelCordinate.add(j);
                }
            }
        }
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
