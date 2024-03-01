package StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> historyBrowser = new ArrayDeque<>(); // stack

        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
              if (historyBrowser.isEmpty()||historyBrowser.size()==1) {
                  System.out.println("no previous URLs");
                  input = scanner.nextLine();
                  continue;
              }
                  historyBrowser.pop();

            } else {
                historyBrowser.push(input);
            }
            System.out.println(historyBrowser.peek());
            input = scanner.nextLine();
        }
    }
}
