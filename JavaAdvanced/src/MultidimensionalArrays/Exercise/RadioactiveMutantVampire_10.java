package MultidimensionalArrays.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class RadioactiveMutantVampire_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] digits = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String [][] trace = new String[digits[0]][digits[1]];
        int row = -1;
        int col = -1;
        fillMatrix(scanner, trace);
        String[] moves = scanner.nextLine().split("");
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("P")){
                    row = i;
                    col = j;
                    trace[row][col] = ".";
                    break;
                }
            }
        }
        boolean isWon = true;
        for (int i = 0; i < moves.length; i++) {
            String currentMove = moves[i];
            if (currentMove.equals("L")) {
                col--;
            } else if (currentMove.equals("R")) {
                col++;
            } else if (currentMove.equals("U")) {
               row--;
            } else if (currentMove.equals("D")) {
                row++;
            }
            if (row <= 0 || row>= trace.length-1){
                break;
            }
            if (col <= 0 || col >= trace[row].length-1) {
                break;
            }


            if (trace[row][col].equals("B")) {
                isWon = false;
                break;
            }
            jumps(trace, i);
            if(trace[row][col].equals("B")) {
                isWon = false;
                break;
            }

        }
        printMatrix(trace);


        if (isWon) {
            System.out.printf("won: %d %d",row,col);
        } else {
            System.out.printf("dead: %d %d",row,col);
        }



    }

    private static void jumps(String[][] trace, int i) {
        for (int j = 0; j < trace.length; j++) {
            for (int k = 0; k < trace[i].length; k++) {
                int bRow = -1;
                int bCol = -1;
                if (trace[j][k].equals("B")) {
                    bRow = j;
                    bCol = k;
                    if ((bRow - 1) >=0 )  {
                        trace[bRow -1][bCol] = "B";
                    }
                    if ((bRow +1) <= trace.length-1) {
                        trace[bRow +1][bCol] = "B";
                    }
                    if ((bCol - 1) >= 0) {
                        trace[bRow][bCol-1] = "B";
                    }
                    if ((bCol +1) <= trace[bRow].length-1) {
                        trace[bRow][bCol+1] = "B";
                    }
                }
            }
        }
    }

    private static void printMatrix(String[][] trace) {
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                System.out.print(trace[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, String[][] trace) {
        for (int i = 0; i < trace.length; i++) {
            String [] line = scanner.nextLine().split("");
            trace[i] = line;
        }
    }
}
