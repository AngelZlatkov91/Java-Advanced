package MidExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OS_Planing_01_26June21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).forEach(e -> tasks.push(Integer.valueOf(e)));


        ArrayDeque<Integer> threads = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> threads.offer(Integer.valueOf(e)));


      int killTask = Integer.parseInt(scanner.nextLine());
      int last = 0;

      while (!threads.isEmpty()) {
          if (tasks.isEmpty()) {
              break;
          }
          int currentTasks = tasks.peek();
          int currentThreads = threads.peek();
          if (currentThreads >= currentTasks) {
              if (currentTasks == killTask) {
                  break;
              }

              tasks.pop();
              threads.poll();

          } else {
              if (currentTasks == killTask) {
                  break;
              }
              threads.poll();
          }

      }
        System.out.printf("Thread with value %d killed task %d%n",threads.peek(),killTask);
        for (int n : threads) {
            System.out.print(n + " ");
            threads.poll();
        }


    }
}
