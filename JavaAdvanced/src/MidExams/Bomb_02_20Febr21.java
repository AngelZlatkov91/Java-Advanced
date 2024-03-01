package MidExams;

import java.util.Scanner;

public class Bomb_02_20Febr21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int nLine = Integer.parseInt(scanner.nextLine());
         String[] commands = scanner.nextLine().split(",");
         String [][]trace = new String[nLine][nLine];

        for (int i = 0; i < trace.length; i++) {
            String []line = scanner.nextLine().split(" ");
            trace[i] = line;
        }
        int row = 0;
        int col = 0;
        int countBomb = 0;
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("s")){
                    row = i;
                    col = j;
                    trace[i][j] = "+";
                }
                if (trace[i][j].equals("B")) {
                    countBomb++;
                }
            }
        }
        boolean isEnd = false;
        for (int i = 0; i < commands.length; i++) {
            String move = commands[i];
            switch (move) {

                case "up":
                    if ((row - 1) >=0) {
                        row--;
                    }
                    break;
                case "down":
                    if ((row +1) <= trace.length-1) {
                        row++;
                    }
                    break;
                case "left":
                    if ((col-1) >=0) {
                        col--;
                    }
                    break;
                case "right":
                    if ((col + 1 ) <= trace.length-1){
                        col++;
                    }
                    break;
            }
            if (trace[row][col].equals("B")) {
                countBomb--;
                trace[row][col] = "+";
                System.out.println("You found a bomb!");
            } else if (trace[row][col].equals("e")) {
                isEnd = true;
                break;
            }


        }


         if (countBomb == 0) {
             System.out.println("Congratulations! You found all bombs!");
         } else if (isEnd) {
             System.out.println("END! "+countBomb+" bombs left on the field");
         } else {
             System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)",countBomb,row,col);
         }


    }
}
