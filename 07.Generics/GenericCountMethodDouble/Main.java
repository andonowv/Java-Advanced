package GenericCountMethodDouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Box <Double> box = new Box<>();
        for (int i = 0; i < count; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            box.add(input);
        }
        double element = Double.parseDouble(scanner.nextLine());
        System.out.println(box.counterGreaterThan(element));

    }
}