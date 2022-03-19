import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Double> price = Arrays.stream(scanner.nextLine().split(", ")).map(e ->Double.parseDouble(e)).collect(Collectors.toList());

        UnaryOperator<Double> VAT = e -> e * 1.20;
        System.out.println("Prices with VAT:");
        price.stream().map(VAT).forEach(e -> System.out.printf("%.2f\n",e));
    }
}
