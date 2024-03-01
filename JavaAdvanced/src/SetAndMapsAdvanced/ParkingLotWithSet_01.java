package SetAndMapsAdvanced;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLotWithSet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> carNum = new LinkedHashSet<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String [] data = input.split(", ");

            switch (data[0]) {
                case "IN" :
                    carNum.add(data[1]);
                    break;
                case "OUT":
                    carNum.remove(data[1]);
                    break;
            }
            input = scanner.nextLine();
        }
        if (carNum.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            carNum.forEach(System.out::println);
        }
    }
}
