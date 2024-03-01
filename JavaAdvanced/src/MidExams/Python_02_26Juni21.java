package MidExams;
import java.util.Scanner;
public class Python_02_26Juni21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int nLine = Integer.parseInt(scanner.nextLine());
         String[] moves = scanner.nextLine().split(", ");
         String [][] trace = new String[nLine][nLine];
        printTrace(scanner, trace);
        int row = 0;
        int col = 0;
        int lentPython = 0;
        int countFood = 0;
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("s")) {
                    row = i;
                    col = j;
                }
                if (trace[i][j].equals("f")){
                    countFood++;
                }
            }
        }
        boolean isAnEnemy = false;
        for (int i = 0; i < moves.length; i++) {
            String command = moves[i];
            switch (command) {
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
            if (row < 0) {
                row = trace.length-1;
            }
            if (row > trace.length-1) {
                row = 0;
            }
            if (col < 0) {
                col = trace.length-1;
            }
            if (col > trace.length-1) {
                col = 0;
            }
            if (trace[row][col].equals("f")){
                lentPython++;
            } else if (trace[row][col].equals("e")) {
                isAnEnemy = true;
                break;
            }
            if (countFood == lentPython){
                break;
            }
        }
        if (isAnEnemy) {
            System.out.println("You lose! Killed by an enemy!");
        } else if (countFood == lentPython) {
            System.out.println("You win! Final python length is " +(lentPython + 1));
        } else {
            System.out.printf("You lose! There is still %d food to be eaten.",countFood - lentPython);
        }
    }

    private static void printTrace(Scanner scanner, String[][] trace) {
        for (int i = 0; i < trace.length; i++) {
            String[] line = scanner.nextLine().split(" ");
            trace[i] = line;
        }
    }
}
