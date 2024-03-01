package MidExams;

import java.util.*;

public class Bombs_01_28June20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> effects = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).forEach(e -> effects.offer(Integer.valueOf(e)));

        ArrayDeque<Integer> casings = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).forEach(e -> casings.push(Integer.valueOf(e)));

        Map<String,Integer> bombs = new TreeMap<>();
        bombs.put("Datura Bombs",0);
        bombs.put("Cherry Bombs",0);
        bombs.put("Smoke Decoy Bombs",0);

        int decrease= 0;
        int count = 0;

        boolean haveItAll = true;
        while (!effects.isEmpty()) {
            if (casings.isEmpty()) {
                break;
            }
            haveItAll = true;
             int sum = (effects.peek() + casings.peek()) - decrease;
            if ( sum == 40) {
                decrease = 0;
                int currentcount = bombs.get("Datura Bombs");
                bombs.put("Datura Bombs",currentcount+1);
                effects.poll();
                casings.pop();
                count++;

            } else if (sum == 60) {
                decrease = 0;
                int currentcount = bombs.get("Cherry Bombs");
                bombs.put("Cherry Bombs",currentcount+1);
                effects.poll();
                casings.pop();
                count++;
            } else if (sum == 120) {
                decrease = 0;
                int currentcount = bombs.get("Smoke Decoy Bombs");
                bombs.put("Smoke Decoy Bombs",currentcount+1);
                effects.poll();
                casings.pop();
                count++;
            } else {
                decrease  += 5;
            }
            if (count >= 9) {
                for (Map.Entry<String, Integer> entry : bombs.entrySet()) {
                    int bomb = entry.getValue();
                    if (bomb <3) {
                        haveItAll = false;
                    }
                }
                if (haveItAll) {
                    break;
                }
            }
        }
        if (haveItAll && count >= 9) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        if (effects.isEmpty()){
            System.out.println("Bomb Effects: empty");
        } else {
            System.out.print("Bomb Effects: ");
            for (int n: effects) {
              if (effects.size() ==1) {
                  System.out.print(n);
              } else {
                  System.out.print(n + ", ");
              }
              effects.poll();
            }
            System.out.println();
        }
        if (casings.isEmpty()){
            System.out.println("Bomb Casings: empty");
        } else {
            System.out.print("Bomb Casings: ");
            for (int n: casings) {
                if (casings.size() ==1) {
                    System.out.print(n);
                } else {
                    System.out.print(n + ", ");
                }
                casings.pop();
            }
            System.out.println();
        }

        for (Map.Entry<String, Integer> entry : bombs.entrySet()) {
            String nameBomb = entry.getKey();
            int countBomb = entry.getValue();
            System.out.println(nameBomb + ": " + countBomb);
        }


    }
}
