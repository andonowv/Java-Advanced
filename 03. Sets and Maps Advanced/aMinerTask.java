import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = " ";
        Map <String, Integer> mined = new LinkedHashMap<>();
        while (!input.equals("stop")){
            input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            mined.putIfAbsent(input, 0);
            mined.put(input, mined.get(input) + quantity);
        }

        mined.forEach((k,v) -> {
            System.out.printf("%s -> %d\n", k, v);
        });
    }
}
