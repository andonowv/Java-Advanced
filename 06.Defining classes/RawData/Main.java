package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List <Car> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String model = tokens [0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens [4];
            double tyre1Pressure = Double.parseDouble(tokens[5]);
            int tyre1Age = Integer.parseInt(tokens[6]);
            double tyre2Pressure = Double.parseDouble(tokens[7]);
            int tyre2age = Integer.parseInt(tokens[8]);
            double tyre3Pressure = Double.parseDouble(tokens[9]);
            int tyre3Age = Integer.parseInt(tokens[10]);
            Car particularCar = new Car(model,engineSpeed,enginePower,cargoWeight,cargoType,tyre1Pressure,tyre1Age,tyre2Pressure,tyre2age,tyre3Pressure,tyre3Age);
            carList.add(particularCar);
        }
        String input = scanner.nextLine();
        if (input.equals("fragile")){
            for (Car car : carList) {
                if (car.getCargoType().equals("fragile") && (car.getTyre1Pressure() <1) ||
                car.getTyre2Pressure() < 1 || car.getTyre3Pressure() < 1){
                    System.out.println(car);
                }
            }
        }else if (input.equals("flamable")){
            for (Car car : carList) {
                if (car.getCargoType().equals("flamable") && car.getEnginePower() > 250){
                    System.out.println(car);
                }
            }
        }
    }
}
