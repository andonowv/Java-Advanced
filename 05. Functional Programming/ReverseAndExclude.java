import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int num = Integer.parseInt(scanner.nextLine());
        Predicate <Integer> isValid = e -> e % num == 0;
        Collections.reverse(numbers);
        numbers.removeIf(isValid);
        numbers.stream().forEach(e -> System.out.printf("%d ", e));
    }
}
