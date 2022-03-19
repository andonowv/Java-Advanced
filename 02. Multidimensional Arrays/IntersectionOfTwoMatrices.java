
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String [][] firstMatrix = new String[rows][cols];
        String [][] secondMatrix = new String[rows][cols];
        String [][] finalMatrix = new String[rows][cols];

        readMatrix(scanner, rows, firstMatrix);

        readMatrix(scanner, rows, secondMatrix);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col].equals(secondMatrix[row][col])){
                    finalMatrix[row][col] = firstMatrix[row][col];
                }else {
                    finalMatrix[row][col] = "*";
                }
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("%s ", finalMatrix[row][col]);
            }
            System.out.println();
        }

    }

    private static void readMatrix(Scanner scanner, int rows, String[][] firstMatrix) {
        for (int row = 0; row < rows; row++) {
            String [] array = scanner.nextLine().split(" ");
            for (int col = 0; col < array.length; col++) {
                firstMatrix [row][col] = array[col];
            }
        }
    }
}
