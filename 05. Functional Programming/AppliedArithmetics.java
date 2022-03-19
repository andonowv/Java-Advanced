import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String input = scanner.nextLine();
        Function <int [], int []> add = list -> Arrays.stream(list).map(e -> e +1).toArray();
        Function <int [], int []> multiply = list -> Arrays.stream(list).map(e -> e *2).toArray();
        Function <int [], int []> subtract = list -> Arrays.stream(list).map(e -> e -1).toArray();
        Consumer<int []> print = list -> Arrays.stream(list).forEach(e -> System.out.printf(String.format("%d ", e)));
        while (!input.equals("end")){
            switch (input){
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
