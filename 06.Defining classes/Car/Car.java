package Car;

public class Car {
    private String Brand;
    private String Model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.Brand = brand;
        this.Model = model;
        this.horsePower = horsePower;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        //The car is: Chevrolet Impala - 390 HP.
        return "The car is: " + getBrand() +" " + getModel() + " - " + getHorsePower() + " HP.";
    }
}
