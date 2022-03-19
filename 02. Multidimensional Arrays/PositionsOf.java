import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] parameters = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int row = parameters[0];
        int col = parameters[1];
        boolean isFound = false;
        int [][] matrix = new int[row][col];

        for (int rows = 0; rows < row; rows++) {
            for (int columns = 0; columns < col; columns++) {
                matrix[rows][columns] = Integer.parseInt(scanner.next());
            }
        }
        scanner.nextLine();
        int searchedDigit = Integer.parseInt(scanner.nextLine());
        for (int rows = 0; rows < row; rows++) {
            for (int columns = 0; columns < col; columns++) {
                if (matrix[rows][columns]== searchedDigit){
                    System.out.printf("%d %d\n", rows, columns);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }

    }
}
