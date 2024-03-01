package MidExams;

import java.util.Scanner;

public class Snake_02_28June20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
          String [][] trace= new String[nLine][nLine];
        for (int i = 0; i < trace.length; i++) {
            String[] line = scanner.nextLine().split("");
            trace[i] = line;
        }
        int row = 0;
        int col = 0;
        int burrow = 0;
        int burCol = 0;
        int burCol2 = 0;
        int burRow2 = 0;
        int burCount = 0;
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("S")) {
                    row = i;
                    col = j;
                    trace[i][j] = ".";
                }
                if (trace[i][j].equals("B")) {
                    burCount++;
                    if (burCount == 2) {
                        burRow2 = i;
                        burCol2=j;
                    } else {
                        burrow = i;
                        burCol = j;
                    }
                }
            }
        }
        int allFood = 0;
        boolean isOut = false;
           boolean isEnough = false;
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("up")) {
                if ((row - 1) < 0) {
                    isOut = true;
                } else {
                    row--;
                }
            } else if (command.equals("down")) {
                if ((row + 1) > trace.length - 1) {
                    isOut = true;
                } else {
                    row++;
                }
            } else if (command.equals("left")) {
                if ((col - 1) < 0) {
                    isOut = true;
                } else {
                    col--;
                }
            } else if (command.equals("right")) {
                if ((col + 1) > trace.length - 1) {
                    isOut = true;
                } else {
                    col++;
                }
            }
            if (isOut) {
                break;
            }
            if (trace[row][col].equals("*")){
                allFood++;
                trace[row][col] = ".";
            } else if (trace[row][col].equals("B")) {
                if (row == burrow && col == burCol) {
                    trace[row][col] = ".";
                    row = burRow2;
                    col = burCol2;
                    trace[row][col] = ".";
                } else {
                    trace[row][col] = ".";
                    row = burrow;
                    col = burCol;
                    trace[row][col] = ".";
                }
            } else if (trace[row][col].equals("-")) {
                trace[row][col] = ".";
            }
            if (allFood == 10) {
                trace[row][col] = "S";
                isEnough = true;
                break;
            }
        }
        if (isOut) {
            System.out.println("Game over!");
        } else if (isEnough) {
            System.out.println("You won! You fed the snake.");
        }
        System.out.println("Food eaten: " + allFood);

        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                System.out.print(trace[i][j]);
            }
            System.out.println();

        }

    }
}
