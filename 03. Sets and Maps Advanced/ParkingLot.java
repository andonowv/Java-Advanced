import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set <String> plateNum = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String [] tokens = input.split(", ");
            String command = tokens[0];
            String plate = tokens [1];

            if (command.equals("IN")){
                plateNum.add(plate);
            }else if (command.equals("OUT")){
                plateNum.remove(plate);
            }
            input = scanner.nextLine();
        }
        if (plateNum.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car: plateNum) {
                System.out.printf("%s\n",car);
            }
        }
    }
}
