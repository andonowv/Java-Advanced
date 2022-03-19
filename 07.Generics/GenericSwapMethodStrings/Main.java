package GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<String> box = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }
        String [] tokens = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(tokens[0]);
        int second = Integer.parseInt(tokens[1]);
        box.swap(first,second);
        System.out.println(box);
    }
}
