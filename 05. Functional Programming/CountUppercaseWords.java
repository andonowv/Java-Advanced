import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> splittedText = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Predicate <String> upperCaseWord = t -> Character.isUpperCase(t.charAt(0));

        List <String> upperCaseList = splittedText.stream().filter(upperCaseWord).collect(Collectors.toList());

        System.out.println(upperCaseList.size());

        upperCaseList.forEach(e -> System.out.println(e));
    }
}
