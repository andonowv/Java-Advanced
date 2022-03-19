import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set <String> VIP = new TreeSet<>();
        Set <String> regular = new TreeSet<>();

        while (!input.equals("PARTY")){
            if (Character.isDigit(input.charAt(0))){
                VIP.add(input);
            }else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")){
            if (VIP.contains(input)){
                VIP.remove(input);
            }else {
                regular.remove(input);
            }
            input = scanner.nextLine();
        }
        int size = VIP.size() + regular.size();
        System.out.println(size);
        for (String badAss: VIP ) {
            System.out.printf("%s\n", badAss);
        }
        for (String normal: regular) {
            System.out.printf("%s\n", normal);
        }

    }
}
