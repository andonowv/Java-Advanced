import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Set <String> resultCompounds = new TreeSet<>();
        for (int i = 0; i < count; i++) {
            String [] compounds = scanner.nextLine().split(" ");
            for (int j = 0; j < compounds.length; j++) {
                resultCompounds.add(compounds[j]);
            }
        }
        resultCompounds.forEach(e -> {
            System.out.printf("%s ", e);
        });
    }
}
