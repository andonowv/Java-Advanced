import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque <Integer> binary = new ArrayDeque<>();
        if (num==0){
            binary.push(0);
        }
        while (num != 0){
            binary.push(num%2);
            num /=2;
        }
        for (Integer bin: binary) {
            System.out.printf("%d",bin);
        };
    }
}
