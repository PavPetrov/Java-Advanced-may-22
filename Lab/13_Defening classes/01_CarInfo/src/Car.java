public class Car {
    public String brand;
    public String model;
    public  int horsePower;

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getHorsePower(){
        return horsePower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public String carInfo(){
        return String.format("The car is: %s %s - %d HP.",
               getBrand(), getModel(), getHorsePower());
    }
}

