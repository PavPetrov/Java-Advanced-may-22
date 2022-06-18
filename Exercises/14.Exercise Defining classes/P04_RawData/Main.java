package P04_RawData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carCount = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new LinkedList<>();

        while (carCount-- > 0) {
            String[] carData = scanner.nextLine().split(" ");
            String model = carData[0];

            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tireList = new LinkedList<>();

            for (int i = 5; i < carData.length; i += 2) {
                double tirePressure = Double.parseDouble(carData[i]);
                int tireAge = Integer.parseInt(carData[i + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tireList.add(tire);
            }
            Car car = new Car(model, engine, cargo, tireList);
            carList.add(car);
        }

        String cargoType = scanner.nextLine();

        //fragile" print all cars whose Cargo Type is "fragile" with a tire whose pressure is  < 1 if the
        // command is "flamable" print all cars whose Cargo Type is "flamable" and have Engine Power > 250. The cars should be

        if(cargoType.equals("fragile")){
            carList.stream()
                    .filter(car -> car.getCargo().getCargoType().equals("fragile"))
                    .filter(car -> car.getTires().stream().anyMatch(tire -> tire.getTirePressure() < 1))
                    .forEach(car -> System.out.println(car.getModel()));


        } else if (cargoType.equals("flamable")){
            carList.stream().filter(car -> car.getCargo().getCargoType().equals("flamable"))
                    .filter(car -> car.getEngine().getGetEnginePower() > 250).forEach(car -> System.out.println(car.getModel()));

        }

    }
}
//"{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType}
// {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age}
// {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}",