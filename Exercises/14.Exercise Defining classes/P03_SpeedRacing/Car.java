package P03_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;

public class Car {
    public static Map<String, Car> carMap = new LinkedHashMap<>();
    String model;
    double fuelAmount;
    double fuelCostKm;
    int distanceTraveled;


    public Car(String model, double fuelAmount, double fuelCostKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostKm = fuelCostKm;
        this.distanceTraveled = 0;
    }


    public static boolean drive(String model, int kmToDrive) {
        Car currentCar = carMap.get(model);
        int distanceTraveled = currentCar.distanceTraveled;
        double fuelCostKm = currentCar.fuelCostKm;
        double fuelAmount = currentCar.fuelAmount;
        double fuelForRide = kmToDrive * fuelCostKm;

        if (fuelForRide <= fuelAmount) {
            fuelAmount -= fuelForRide;
            distanceTraveled += kmToDrive;
            currentCar.fuelAmount = fuelAmount;
            currentCar.distanceTraveled = distanceTraveled;
            carMap.put(model, currentCar);
            return true;
        }
        return false;
    }
}
