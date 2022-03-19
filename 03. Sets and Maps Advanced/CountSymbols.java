import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> counts = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            counts.putIfAbsent(letter, 0);
            counts.put(letter, counts.get(letter) +1);
        }

        counts.forEach((k, v) -> {
            System.out.printf("%c: %d time/s\n", k, v);
        });
    }
}
