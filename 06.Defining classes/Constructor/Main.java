package Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List <Constructors> constructorList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 3){
                String brand = tokens [0];
                String model = tokens [1];
                int horsePower = Integer.parseInt(tokens[2]);
                Constructors particularCar = new Constructors(brand, model, horsePower);
                constructorList.add(particularCar);
                continue;
            }else if (tokens.length==2){
                String brand = tokens [0];
                String model = tokens [1];
                Constructors particularCar = new Constructors(brand, model);
                constructorList.add(particularCar);
            }else if (tokens.length == 1){
                String brand = tokens [0];
                Constructors particularCar = new Constructors(brand);
                constructorList.add(particularCar);
            }
        }
        for (Constructors constructors : constructorList) {
            System.out.println(constructors);
        }
    }
}
