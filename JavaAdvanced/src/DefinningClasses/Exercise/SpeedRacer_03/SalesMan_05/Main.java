package DefinningClasses.Exercise.SpeedRacer_03.SalesMan_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enginesCount = Integer.parseInt(scanner.nextLine());
        List<Engine> allEngine = new ArrayList<>();
        for (int i = 0; i < enginesCount; i++) {
            String[] engine = scanner.nextLine().split("\\s+");
            String model = engine[0];
            int power = Integer.parseInt(engine[1]);
            int displacement = 0;
            String efficiency = null;
            if (engine.length==4) {
                displacement = Integer.parseInt(engine[2]);
                efficiency = engine[3];
            } else if (engine.length ==3) {
                if (Character.isDigit(engine[2].charAt(0))) {
                    displacement = Integer.parseInt(engine[2]);
                } else {
                    efficiency = engine[2];
                }
            }
            Engine engines = new Engine(model,power,displacement,efficiency);
            allEngine.add(engines);

        }

        int carsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < carsCount; i++) {
            String [] carData = scanner.nextLine().split("\\s+");
            String carModel = carData[0];
            String engineModel = carData[1];
            int weight = 0;
            String color = null;
            if (carData.length==4) {
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length==3) {
                if (Character.isDigit(carData[2].charAt(0))) {
                    weight = Integer.parseInt(carData[2]);
                } else {
                    color = carData[2];
                }
            }
            Engine carEngine = null;
            for (Engine eng : allEngine) {
                if (engineModel.equals(eng.getModel())) {
                    carEngine = eng;
                    break;
                }
            }
            
            
            Car car = new Car(carModel,carEngine,weight,color);
            System.out.print(car.toString());
        }








    }
}
