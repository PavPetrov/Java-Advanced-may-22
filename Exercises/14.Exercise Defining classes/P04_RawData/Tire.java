package P04_RawData;

public class Tire {
    private double tirePressure;
    private int age;

    public Tire(double tirePressure, int age) {
        this.tirePressure = tirePressure;
        this.age = age;
    }

    public double getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(double tirePressure) {
        this.tirePressure = tirePressure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
