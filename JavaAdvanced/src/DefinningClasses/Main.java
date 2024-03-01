package DefinningClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] data = scanner.nextLine().split(" ");
            Car car = new Car(data[0]);
            if (data.length >1) {
                int hp = Integer.parseInt(data[2]);
                car.setModel(data[1]);
                car.setHorsePower(hp);
            }

            System.out.println(car);
        }


    }
}
