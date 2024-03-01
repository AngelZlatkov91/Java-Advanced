package StacksAndQueues;
import java.util.*;
import java.util.stream.Collectors;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         List<String> expressionParts = Arrays.stream(scanner.nextLine().split(" "))
                 .collect(Collectors.toList());
         Collections.reverse(expressionParts);

        ArrayDeque<String> elements = new ArrayDeque<>();// Stack

        for (String element : expressionParts) {
            elements.push(element);
        }
          while (elements.size() >1) {
              int firstDigit = Integer.parseInt(elements.pop());
              String operation =  elements.pop();
              int secondDigit = Integer.parseInt(elements.pop());
                int result;
              switch (operation) {
                  case "+":
                     result = firstDigit+secondDigit;
                      break;
                  case  "-":
                      result = firstDigit-secondDigit;
                      break;
                  default:
                      System.out.println("Unknown operation " + operation);
                      return;
              }
              elements.push("" + result);
          }
        System.out.println(elements.peek());


    }
}
