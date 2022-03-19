import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] parameters = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int rows = parameters[0];
        int col = parameters [1];

        int [][] mainMatrix = new int[rows][col];

        readMatrix(scanner, rows, col, mainMatrix);

        int [][] finalMatrix = new int[2][2];
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < rows - 1; row++) {
            for (int cols = 0; cols < col - 1; cols++) {
                sum = mainMatrix[row][cols] + mainMatrix[row + 1][cols] + mainMatrix[row][cols+1] + mainMatrix[row+1][cols+1];
                if (sum > maxSum){
                    maxSum = sum;
                    finalMatrix[0][0] = mainMatrix[row][cols];
                    finalMatrix[0][1] = mainMatrix[row][cols+1];
                    finalMatrix[1][0] = mainMatrix[row+1][cols];
                    finalMatrix[1][1] = mainMatrix[row+1][cols+1];
                }
            }
        }
        for (int row = 0; row < 2; row++) {
            for (int cols = 0; cols < 2; cols++) {
                System.out.printf("%d ", finalMatrix[row][cols]);
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static void readMatrix(Scanner scanner, int rows, int col, int[][] mainMatrix) {
        for (int row = 0; row < rows; row++) {
            int [] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e->Integer.parseInt(e)).toArray();
            for (int cols = 0; cols < col; cols++) {
                mainMatrix[row][cols] = array[cols];
            }
        }
    }
}
