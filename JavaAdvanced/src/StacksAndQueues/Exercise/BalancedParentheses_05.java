package StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
        ArrayDeque <Character> open = new ArrayDeque<>();// stack
        boolean areBalance = true;
        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{' ) {
                open.push(bracket);
            } else  if (bracket == ')'  || bracket == ']' || bracket == '}' ) {
                if (open.isEmpty()) {
                    areBalance = false;
                    break;
                }
                char lastOpen = open.pop();


                if (lastOpen == '(' && bracket == ')') {

                } else if (lastOpen == '[' && bracket == ']') {

                } else if (lastOpen == '{' && bracket == '}') {

                } else {
                    areBalance = false;
                    break;
                }
            }
        }
        if (areBalance) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}
