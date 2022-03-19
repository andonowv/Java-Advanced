package SpeedRacing;

public class Car {
    String model;
    double fuelAmount;
    double consumption;
    private double distance;

    public Car (String model, double fuelAmount, double consumption){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distance = 0;
    }

    public boolean drive(double distanceToDrive) {
        double needFuel = distanceToDrive * this.consumption;
        if (needFuel > this.fuelAmount){
            return false;
        }else {
            this.distance += distanceToDrive;
            this.fuelAmount -= needFuel;
            return true;
        }

    }

    @Override
    public String toString() {
        //"<Model> <fuelAmount>  <distanceTraveled>",
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, distance);
    }
}
