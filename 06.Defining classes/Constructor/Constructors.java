package Constructor;

public class Constructors {
    private String brand;
    private String model;
    private int horsePower;

    public Constructors(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public Constructors (String brand, String model){

        this(brand,model, -1);
    }
    public Constructors (String brand, int horsePower){

        this(brand, "unknown", horsePower);
    }
    public Constructors (String brand){
        this(brand, "unknown", -1);
    }

    @Override
    public String toString() {
        //The car is: Golqma Kola - 49 HP.
        return "The car is: " + brand + " " + model + " - " + horsePower + " HP.";
    }
}
