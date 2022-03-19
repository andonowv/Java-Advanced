package Car;

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
            String brand = tokens [0];
            String model = tokens [1];
            int horsePower = Integer.parseInt(tokens[2]);
            Car particularCar = new Car(brand, model, horsePower);
            carList.add(particularCar);
        }

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
