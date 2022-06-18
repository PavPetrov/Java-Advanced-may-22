package P03_SpeedRacing;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int carCount = Integer.parseInt(scanner.nextLine());

        while (carCount-- > 0) {
            String[] carData = scanner.nextLine().split(" ");

            String carModel = carData[0];
            double fuelAmount = Double.parseDouble(carData[1]);
            double fuelCostKm = Double.parseDouble(carData[2]);

            Car car = new Car(carModel, fuelAmount, fuelCostKm);
            Car.carMap.putIfAbsent(carModel, car);
        }

        System.out.println();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandData = command.split(" ");
            String carModel = commandData[1];
            int amountKm = Integer.parseInt(commandData[2]);

           if(!Car.drive(carModel, amountKm)){
               System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }

        Car.carMap.entrySet().stream().forEach(entry ->
            System.out.printf("%s %.2f %d%n", entry.getKey(), entry.getValue().fuelAmount, entry.getValue().distanceTraveled));
    }
}

