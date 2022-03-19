import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] parameters = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int rowSIze = parameters[0];
        int colSize = parameters[1];

        for (int row = 0; row < rowSIze; row++) {
            for (int col = 0; col < colSize; col++) {
                System.out.printf("%c%c%c ", (char)('a' + row), (char)('a' + col + row), (char)('a' + row));;
            }
            System.out.println();
        }
    }
}
