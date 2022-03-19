import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] counts = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int firstSize = counts [0];
        int secondSize = counts [1];

        if (firstSize == 0 || secondSize == 0){
            return;
        }
        Set <Integer> firstSet = new LinkedHashSet<>();
        Set <Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSize; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            firstSet.add(num);
        }
        for (int i = 0; i < secondSize; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            secondSet.add(num);
        }

        firstSet.forEach( e -> {
            if (secondSet.contains(e)){
                System.out.printf("%d ", e);
            }
        });
    }
}
