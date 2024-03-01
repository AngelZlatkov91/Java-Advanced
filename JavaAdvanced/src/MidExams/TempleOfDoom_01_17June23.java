package MidExams;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TempleOfDoom_01_17June23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int [] tools = Arrays.stream(scanner.nextLine().split(" "))
                 .mapToInt(Integer::parseInt)
                 .toArray();
        int [] substances = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

       List<Integer> challenges = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> tolls = new ArrayDeque<>();//Queue
        ArrayDeque<Integer> substance = new ArrayDeque<>();// Stack
        for (int digit:tools) {
            tolls.offer(digit);
        }
        for (int digit : substances) {
            substance.push(digit);
        }

        boolean isEmpty = false;

        while (!tolls.isEmpty()) {
            if (challenges.contains(tolls.peek() * substance.peek())) {
                int currentNum = tolls.peek() * substance.peek();
                tolls.poll();
                substance.pop();
                int index = challenges.indexOf(currentNum);
                challenges.remove(index);
                if (challenges.isEmpty()) {
                    isEmpty = true;
                    break;
                }

            } else {
                int currentTols = tolls.poll();
                int currentSubstance = substance.pop();

                tolls.offer(currentTols+1);

                if ((currentSubstance -1) > 0) {
                    substance.push(currentSubstance-1);
                }
            }
            if (substance.isEmpty()) {
                break;
            }

        }

        if (tolls.isEmpty() || isEmpty) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");

        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }
        if (!tolls.isEmpty()){
            System.out.print("Tools: ");
            for (int el : tolls) {
                tolls.poll();
                if (tolls.size() ==0) {
                    System.out.print(el);
                    System.out.println();
                } else {
                    System.out.print(el + ", ");
                }

            }
        }


        if (!substance.isEmpty()) {
            System.out.print("Substances: ");
            for (int el : substance) {
                substance.pop();
                if (substance.size() ==0) {
                    System.out.print(el);
                    System.out.println();
                } else {
                    System.out.print(el + ", ");
                }

            }

        }

        if (!challenges.isEmpty()) {
            System.out.print("Challenges: ");
            for (int i = 0; i < challenges.size(); i++) {
                int el = challenges.get(i);
                if (i == challenges.size()-1) {
                    System.out.print(el);
                } else {
                    System.out.print(el + ", ");
                }
            }
        }




    }
}
