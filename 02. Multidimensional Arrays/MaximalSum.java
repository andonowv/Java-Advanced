import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] parameters = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int rowSize = parameters[0];
        int colSize = parameters [1];
        int [][] matrix = new int[rowSize][colSize];
        int maxSum = Integer.MIN_VALUE;
        int startRow =0;
        int startCol = 0;
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                matrix [row][col] = Integer.parseInt(scanner.next());
            }
        }
        for (int row = 0; row < rowSize - 2; row++) {
            for (int col = 0; col < colSize - 2; col++) {
                int currentSum = matrix[row][col] + matrix[row + 1][col]
                        + matrix[row+2][col] + matrix [row][col + 1] + matrix [row+1][ col + 1]
                        + matrix [row+2][col+1] + matrix [row][col+2] + matrix [row+1][col+2] + matrix [row+2][col+2];
                if ( currentSum> maxSum){
                    maxSum = currentSum;
                    startRow = row;
                    startCol = col;
                }
            }
        }
        System.out.printf("Sum = %d", maxSum);

        System.out.println();
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                System.out.printf("%d ", matrix [row][col]);
            }
            System.out.println();
        }
    }
}
