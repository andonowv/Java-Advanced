import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <String> names = new ArrayDeque<>();

        String [] players = scanner.nextLine().split(" ");

        int count = Integer.parseInt(scanner.nextLine());

        for (String child : players)
            names.offer(child);


        while (names.size()>1){
            for (int i = 1; i < count; i++) {
                names.offer(names.poll());
            }
            System.out.println("Removed " + names.poll());
        }
        System.out.println("Last is " + names.poll());
    }
}
