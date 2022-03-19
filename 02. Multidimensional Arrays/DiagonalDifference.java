import java.util.Map;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumDiagonals = 0;
        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[size][size];

        for (int rows = 0; rows < size; rows++) {
            for (int cols = 0; cols < size; cols++) {
                matrix[rows][cols] = Integer.parseInt(scanner.next());
            }
        }
        int row = 0;
        int col = 0;
        while (row < size && col < size){
            sumDiagonals += matrix[row++][col++];
        }
        row = size-1;
        col = 0;
        while (row >= 0 && col < size){
            sumDiagonals -= matrix[row--][col++];
        }
        int finalResult = Math.abs(sumDiagonals);
        System.out.println(finalResult);
    }
}
