package SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Map <String, Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String model = tokens [0];
            double fuelAmount = Double.parseDouble(tokens [1]);
            double consumption = Double.parseDouble(tokens [2]);
            Car particularCar = new Car(model,fuelAmount,consumption);
            carMap.put(model, particularCar);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String [] tokens = input.split("\\s+");
            String model = tokens [1];
            double distanceToDrive = Double.parseDouble(tokens [2]);
            Car carToDrive = carMap.get(model);

            if (!carToDrive.drive(distanceToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }
            input = scanner.nextLine();
        }

        for (Car particularCar: carMap.values()) {
            System.out.println(particularCar);
        }
        int b = 0;
    }
}
