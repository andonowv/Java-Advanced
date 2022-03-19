import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Set <String> names = new LinkedHashSet<>();
        for (int i = 0; i < count; i++) {

            String name = scanner.nextLine();
            if (!names.contains(name)){
                names.add(name);
            }
        }
        names.stream().forEach( entry -> {
            System.out.printf("%s\n", entry);
        });
    }
}
