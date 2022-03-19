import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(e ->Integer.parseInt(e)).collect(Collectors.toList());

        Function <List<Integer>, Integer> smallestNum = s -> Collections.min(s);

        int min = smallestNum.apply(numbers);

        System.out.println(numbers.lastIndexOf(min));
    }
}
