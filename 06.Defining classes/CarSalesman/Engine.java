package CarSalesman;

public class Engine {
    //model, power, displacement and efficiency
    private String engineModel;
    private int power;
    private int displacement;
    private String efficiency;
    //Engine's displacements and efficiency are optional

    public Engine(String engineModel, int power, int displacement, String efficiency){
        this.engineModel = engineModel;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
    public Engine (String engineModel, int power){
        this.engineModel = engineModel;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }
    public Engine(String engineModel, int power, int displacement){
        this.engineModel = engineModel;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = "n/a";
    }
    public  Engine(String engineModel, int power, String efficiency){
        this.engineModel = engineModel;
        this.power = power;
        this.efficiency = efficiency;
        this.displacement = 0;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
