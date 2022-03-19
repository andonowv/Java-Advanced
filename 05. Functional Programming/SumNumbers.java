import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        Function <String, Integer> count = x -> Arrays.stream(x.split(", ")).map(e -> Integer.parseInt(e)).collect(Collectors.toList()).size();

        int size = count.apply(numbers);

        System.out.printf("Count = %d", size);
        Function <String, Integer> sum = y -> Arrays.stream(y.split(", ")).mapToInt(e -> Integer.parseInt(e)).sum();
        System.out.println();
        int sumOut = sum.apply(numbers);
        System.out.printf("Sum = %d", sumOut);
    }
}
