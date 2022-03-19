package RawData;

public class Car {
    private String model;
    private int engineSpeed;
    private int enginePower;
    private int cargoWeight;
    private String cargoType;
    private double tyre1Pressure;
    private int tyre1Age;
    private double tyre2Pressure;
    private int tyre2Age;
    private double tyre3Pressure;
    private int tyre3Age;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType
            , double tyre1Pressure, int tyre1Age, double tyre2Pressure
            , int tyre2Age, double tyre3Pressure, int tyre3Age) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tyre1Pressure = tyre1Pressure;
        this.tyre1Age = tyre1Age;
        this.tyre2Pressure = tyre2Pressure;
        this.tyre2Age = tyre2Age;
        this.tyre3Pressure = tyre3Pressure;
        this.tyre3Age = tyre3Age;
    }

    public String getCargoType() {
        return cargoType;
    }

    public double getTyre1Pressure() {
        return tyre1Pressure;
    }

    public double getTyre2Pressure() {
        return tyre2Pressure;
    }

    public double getTyre3Pressure() {
        return tyre3Pressure;
    }

    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public String toString() {
        return model;
    }
}
