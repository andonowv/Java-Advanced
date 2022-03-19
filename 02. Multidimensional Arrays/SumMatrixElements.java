import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] parameters = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int row = parameters[0];
        int col = parameters[1];
        int sum = 0;

        for (int rows = 0; rows < row; rows++) {
            int [] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e->Integer.parseInt(e)).toArray();
            for (int cols = 0; cols < col; cols++) {
                sum+= array[cols];
            }
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
