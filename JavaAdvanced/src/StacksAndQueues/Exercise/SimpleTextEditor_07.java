package StacksAndQueues.Exercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class SimpleTextEditor_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());// брой команди
         StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> allText = new ArrayDeque<>();// stack
        for (int commandNum = 1; commandNum <= n; commandNum++) {
            String command = scanner.nextLine();
            if (command.startsWith("1")) {
                allText.push(currentText.toString());
                String word = command.split(" ")[1];
                currentText.append(word);
            } else if (command.startsWith("2")) {
                allText.push(currentText.toString());
                int count = Integer.parseInt(command.split(" ")[1]);
                int startIndex = currentText.length() - count;
                currentText.delete(startIndex,currentText.length());
            } else if (command.startsWith("3")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                System.out.println(currentText.charAt(index-1));
            } else if (command.equals("4")) {
                if (!allText.isEmpty()) {
                    String last = allText.pop();
                    currentText = new StringBuilder(last);
                }
            }
        }
    }
}
