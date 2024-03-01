package StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;
public class BrowserHistoryUpgrade_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> backUrl = new ArrayDeque<>();//Stack
        ArrayDeque<String> forwardUrl = new ArrayDeque<>();//Queue

        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("forward")) {
                if (forwardUrl.isEmpty() || forwardUrl.size() ==1) {
                    System.out.println("no next URLs");
                } else {
                    forwardUrl.poll();
                    backUrl.push(forwardUrl.peek());

                    System.out.println(forwardUrl.poll());
                }

            } else if (input.equals("back")) {
                if (backUrl.isEmpty() || backUrl.size() == 1) {
                    System.out.println("no previous URLs");
                }else {
                    forwardUrl.offer(backUrl.peek());
                    backUrl.pop();
                    System.out.println(backUrl.pop());
                }
            } else {
                backUrl.push(input);
                forwardUrl.offer(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
        }





    }
}
