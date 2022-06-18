package P04_RawData;

public class Engine {
    private int engineSpeed;
    private int getEnginePower;

    public Engine(int engineSpeed, int getEnginePower) {
        this.engineSpeed = engineSpeed;
        this.getEnginePower = getEnginePower;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public int getGetEnginePower() {
        return getEnginePower;
    }

    public void setGetEnginePower(int getEnginePower) {
        this.getEnginePower = getEnginePower;
    }
}
