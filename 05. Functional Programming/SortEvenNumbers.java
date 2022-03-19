import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        List <Integer> evenNums = numbers.stream().filter(e -> e % 2 ==0).collect(Collectors.toList());

        List <Integer> sortedNums = evenNums.stream().sorted().collect(Collectors.toList());

        String firstOutput = evenNums.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(", "));
        System.out.println(firstOutput);
        String secondOutput = sortedNums.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(", "));
        System.out.println(secondOutput);
    }
}
