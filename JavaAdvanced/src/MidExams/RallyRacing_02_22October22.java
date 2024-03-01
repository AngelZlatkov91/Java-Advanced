package MidExams;

import java.util.Scanner;

public class RallyRacing_02_22October22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLine = Integer.parseInt(scanner.nextLine());
        String nameCar = scanner.nextLine();
        String[][] trace = new String[nLine][nLine];
        for (int i = 0; i < trace.length; i++) {
            String [] line = scanner.nextLine().split(" ");
            trace[i] = line;
        }
        int tunel2Row = 0;
        int tunel2Col = 0;
        for (int i = 0; i <trace.length ; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("T")){
                        tunel2Row = i;
                        tunel2Col = j;
                }
            }
        }
        int km = 0;
        int row = 0;
        int col = 0;
        boolean isFinish = false;

        String moves = scanner.nextLine();
        while (!moves.equals("End")) {
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
            if (trace[row][col].equals("T")) {
                km += 30;
                trace[row][col] = ".";
                trace[tunel2Row][tunel2Col] = ".";
                row = tunel2Row;
                col = tunel2Col;


            } else if (trace[row][col].equals("F")) {
                km += 10;
                isFinish = true;
                break;

            } else {
                km += 10;
            }

            moves = scanner.nextLine();
        }
        if (isFinish) {
            System.out.println("Racing car "+nameCar + " finished the stage!");
        } else {
            System.out.println("Racing car "+nameCar+" DNF.");
        }

        System.out.println("Distance covered "+km+" km.");
        trace[row][col]="C";
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                System.out.print(trace[i][j]);
            }
            System.out.println();
        }




    }
}
