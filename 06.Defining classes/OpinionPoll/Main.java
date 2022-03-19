package OpinionPoll;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List <OpinionPoll> person = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String name = tokens [0];
            int age = Integer.parseInt(tokens [1]);

            if (age > 30){
                OpinionPoll particularPerson = new OpinionPoll(name, age);
                person.add(particularPerson);
            }
        }
        person.sort(Comparator.comparing(e -> e.getName()));
        for (OpinionPoll opinionPoll : person) {
            System.out.println(opinionPoll);
        }
    }
}
