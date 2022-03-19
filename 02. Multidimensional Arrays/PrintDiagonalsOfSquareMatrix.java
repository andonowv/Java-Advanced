import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[size][size];

        for (int rows = 0; rows < size; rows++) {
            int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
            for (int cols = 0; cols < size; cols++) {
                matrix [rows][cols] = array[cols];
            }
        }

        int rows = 0;
        int cols = 0;

        while (rows < size && cols < size){
            System.out.printf("%d ", matrix[rows++][cols++]);
        }

        rows = size - 1;
        cols = 0;
        System.out.println();
        while (rows >= 0 && cols < size){
            System.out.printf("%d ", matrix[rows--][cols++]);
        }
    }
}
