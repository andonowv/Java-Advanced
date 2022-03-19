import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");

        ArrayDeque <String> reverse = new ArrayDeque<>();

        for (String reversing: numbers) {
            reverse.push(reversing);

        }

        for (String num : reverse) {
            System.out.printf("%s ", num);

        }
    }
}
