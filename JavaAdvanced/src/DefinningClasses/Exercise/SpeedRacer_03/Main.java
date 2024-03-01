package DefinningClasses.Exercise.SpeedRacer_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  Integer.parseInt(scanner.nextLine());

        Map<String , Car> cars = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String[] data = scanner.nextLine().split(" ");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double priceFuelPerKm = Double.parseDouble(data[2]);
            Car car = new Car(model,fuelAmount,priceFuelPerKm);
            cars.put(model,car);
        }

       String input = scanner.nextLine();
        while (!input.equals("End")) {
            String carModel = input.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(input.split("\\s+")[2]);
            Car carToDrive = cars.get(carModel);
            if (!carToDrive.drive(kmToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }

            input = scanner.nextLine();
        }
        for (Car car : cars.values()) {
            System.out.println(car);
        }


    }
}
