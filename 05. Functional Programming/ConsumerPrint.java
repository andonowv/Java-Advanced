import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Consumer <String> printNames = e -> System.out.println(e);
        names.stream().forEach(printNames);

    }
}
