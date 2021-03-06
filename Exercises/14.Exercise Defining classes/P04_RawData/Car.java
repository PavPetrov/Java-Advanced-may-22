package P04_RawData;

import java.util.List;

public class Car {
    //the model, engine, cargo, and a collection of exactly 4 tires.
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires ;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }
}
