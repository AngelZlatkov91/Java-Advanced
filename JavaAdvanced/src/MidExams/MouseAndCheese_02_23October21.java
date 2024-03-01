package MidExams;

import java.util.Scanner;

public class MouseAndCheese_02_23October21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int size = Integer.parseInt(scanner.nextLine());
      String [][] trace = new String[size][size];
        fillMatrix(scanner, trace);
        int countChees = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("M")) {
                    row = i;
                    col = i;
                    trace[i][j] = "-";
                }
            }
        }
        boolean isOut = false;
        String moves = scanner.nextLine();
        while (!moves.equals("end")) {
            switch (moves) {
                case "up":
                    row--;
                    break;
                case "down":
                    row++;
                    break;
                case "left":
                    col--;
                    break;
                case "right":
                    col++;
                    break;
            }
            if (row < 0 || col <0 || row > trace.length || col > trace.length) {
                isOut = true;
                break;
            }
            if (trace[row][col].equals("c")) {
                countChees++;
                trace[row][col] = "-";
            } else if (trace[row][col].equals("B")) {
                    trace[row][col] = "-";
                moves = scanner.nextLine();
                continue;

            }
            moves = scanner.nextLine();
        }

        if (isOut) {
            System.out.println("Where is the mouse?");
        }
        if (countChees >= 5) {
            System.out.println("Great job, the mouse is fed 5 cheeses!");
            trace[row][col] = "M";
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",5-countChees);
            if (!isOut) {
                trace[row][col] = "M";
            }
        }
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
