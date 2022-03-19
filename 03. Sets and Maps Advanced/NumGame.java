import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class NumGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet <Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(e->Integer.parseInt(e))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet <Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(e->Integer.parseInt(e))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int count = 50;

        while (count-- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()){

            int first = firstPlayer.iterator().next();
            int second = secondPlayer.iterator().next();
            firstPlayer.remove(first);
            secondPlayer.remove(second);
            if (first > second){
                firstPlayer.add(first);
                firstPlayer.add(second);
            }else {
                secondPlayer.add(first);
                secondPlayer.add(second);
            }
        }
        if (firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        }else if (secondPlayer.size() == firstPlayer.size()){
            System.out.println("Draw!");
        }
    }
}
