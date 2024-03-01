package MidExams;
import java.util.Arrays;
import java.util.Scanner;

public class MouseInTheKItchen_02_17June23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] rowAndCol = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
          String [][] trace = new String[rowAndCol[0]][rowAndCol[1]];

        fillMatrix(scanner, trace);
        int row = 0;
        int col =0;
        int count =0;
        for (int i = 0; i < trace.length; i++) {
            for (int j = 0; j < trace[i].length; j++) {
                if (trace[i][j].equals("M")) {
                    row=i;
                    col =j;
                    trace[i][j] = "*";
                }
                if (trace[i][j].equals("C")) {
                    count++;
                }
            }
        }

        boolean isOutTrace = false;
          boolean isTrap = false;
        String input = scanner.nextLine();
        while (!input.equals("danger")) {
            if (input.equals("up")) {
                if ((row-1)>-1) {
                    if (!trace[row-1][col].equals("@")) {
                        if (trace[row-1][col].equals("C")) {
                            count--;
                              row--;
                              trace[row][col]="*";
                        } else if (trace[row-1][col].equals("T")) {
                            row--;
                            trace[row][col] = "M";
                            isTrap=true;
                            break;
                        } else {
                            row--;
                        }
                    }
                } else {
                    isOutTrace = true;
                    trace[row][col] = "M";
                    break;
                }

            } else if (input.equals("down")) {
                if ((row+1)< trace.length) {
                    if (!trace[row+1][col].equals("@")) {
                        if (trace[row+1][col].equals("C")) {
                            count--;
                            row++;
                            trace[row][col] = "*";
                        } else if (trace[row+1][col].equals("T")) {
                            row++;
                            trace[row][col] = "M";
                            isTrap=true;
                            break;
                        } else {
                            row++;
                        }
                    }
                } else {
                    isOutTrace = true;
                    trace[row][col] = "M";
                    break;
                }


            } else if (input.equals("right")) {
                if ((col+1)< trace.length) {
                    if (!trace[row][col+1].equals("@")) {
                        if (trace[row][col+1].equals("C")) {
                            count--;
                            col++;
                            trace[row][col] = "*";
                        } else if (trace[row][col+1].equals("T")) {
                            col++;
                            isTrap=true;
                            trace[row][col] = "M";
                            break;
                        } else {
                            col++;
                        }
                    }
                } else {
                    isOutTrace = true;
                    trace[row][col] = "M";
                    break;
                }

            } else if (input.equals("left")) {
                if ((col-1)>-1) {
                    if (!trace[row][col-1].equals("@")) {
                        if (trace[row][col-1].equals("C")) {
                            count--;
                            col--;
                            trace[row][col] = "*";
                        } else if (trace[row][col-1].equals("T")) {
                            col--;
                            trace[row][col] = "M";
                            isTrap=true;
                            break;
                        } else {
                            col--;
                        }
                    }
                } else {
                    isOutTrace = true;
                    trace[row][col] = "M";
                    break;
                }

            }
            if (count == 0) {
                trace[row][col] = "M";
                break;
            }


            input = scanner.nextLine();
        }
        if (count == 0) {
            System.out.println("Happy mouse! All the cheese is eaten, good night!");
        }
        if (isTrap) {
            System.out.println("Mouse is trapped!");
        }
        if (isOutTrace) {
            System.out.println("No more cheese for tonight!");
        }
        if (input.equals("danger")) {
            System.out.println("Mouse will come back later!");
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
            String[] line = scanner.nextLine().split("");
            trace[i] = line;
        }
    }
}
