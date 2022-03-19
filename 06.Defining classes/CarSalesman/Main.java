package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEngine = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        for (int i = 0; i < countEngine; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String model = tokens [0];
            int power = Integer.parseInt(tokens[1]);
            if (tokens.length==2){
                Engine particularEngine = new Engine(model, power);
                engineList.add(particularEngine);
            }else if (tokens.length ==3){
                if (Character.isDigit(tokens[2].charAt(0))){
                    int displacement = Integer.parseInt(tokens[2]);
                    Engine particularEngine = new Engine(model, power, displacement);
                    engineList.add(particularEngine);
                }else {
                    String efficiency = tokens [2];
                    Engine particularEngine = new Engine(model, power, efficiency);
                    engineList.add(particularEngine);
                }
            }else if (tokens.length == 4){
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens [3];
                Engine particularEngine = new Engine(model, power, displacement, efficiency);
                engineList.add(particularEngine);
            }
        }
        int countCars = Integer.parseInt(scanner.nextLine());
        List <Car> carList = new ArrayList<>();
        for (int i = 0; i < countCars; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String model = tokens [0];
            String engine = tokens [1];
            if (tokens.length == 2){
                Car particularCar = new Car(model,engine);
                carList.add(particularCar);
            }else if (tokens.length == 3){
                if (Character.isDigit(tokens[2].charAt(0))){
                    int weight = Integer.parseInt(tokens[2]);
                    Car particularCar = new Car(model,engine,weight);
                    carList.add(particularCar);
                }else {
                    String color = tokens [2];
                    Car particularCar = new Car(model,engine,color);
                    carList.add(particularCar);
                }
            }else if (tokens.length == 4){
                int weight = Integer.parseInt(tokens[2]);
                String color = tokens [3];
                Car particularCar = new Car(model,engine,weight, color);
                carList.add(particularCar);
            }
        }
        for (Car car : carList) {
            System.out.printf("%s:\n", car.getModel());
            System.out.printf("%s:\n", car.getEngine());
            for (Engine particularEngine : engineList) {
                if (car.getEngine().equals(particularEngine.getEngineModel())){
                    if (particularEngine.getPower()==0){
                        System.out.println("Weight: n/a");
                    }else {
                        System.out.printf("Power: %d\n", particularEngine.getPower());
                    }if (particularEngine.getDisplacement() == 0){
                        System.out.println("Displacement: n/a");
                    }else {
                        System.out.printf("Displacement: %d\n", particularEngine.getDisplacement());
                    }
                    System.out.printf("Efficiency: %s\n", particularEngine.getEfficiency());
                }
            }
            if (car.getWeight() == 0){
                System.out.println("Weight: n/a");
            }else {
                System.out.printf("Weight: %d\n", car.getWeight());
            }
            System.out.printf("Color: %s\n", car.getColor());
        }
    }
}
