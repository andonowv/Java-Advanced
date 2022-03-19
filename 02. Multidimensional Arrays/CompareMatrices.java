import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEqual = false;
        String [] firstMatrix = scanner.nextLine().split(" ");
        int rowsFirst = Integer.parseInt(firstMatrix[0]);
        int columnFirst = Integer.parseInt(firstMatrix[1]);

        int [][] firsttMatrix = new int[rowsFirst][columnFirst];

        for (int row = 0; row < rowsFirst; row++) {
            for (int col = 0; col < columnFirst; col++) {
                firsttMatrix [row][col] = Integer.parseInt(scanner.next());
            }
        }
        scanner.nextLine();

        String [] secondMatrixSize = scanner.nextLine().split(" ");
        int rowsSecond = Integer.parseInt(secondMatrixSize[0]);
        int columnsSecond = Integer.parseInt(secondMatrixSize[1]);

        int [][] secondMatrix = new int[rowsSecond][columnsSecond];

        for (int row = 0; row < rowsSecond; row++) {
            for (int col = 0; col < columnsSecond; col++) {
                secondMatrix [row][col] = Integer.parseInt(scanner.next());
            }
        }

        if (rowsFirst!=rowsSecond || columnFirst != columnsSecond){
            System.out.println("not equal");
        }else if (rowsFirst==rowsSecond && columnFirst == columnsSecond){
            for (int row = 0; row < rowsFirst; row++) {
                for (int col = 0; col < columnFirst; col++) {
                    if (firsttMatrix[row][col] == secondMatrix [row][col]){
                        isEqual = true;
                    }else {
                        isEqual = false;
                        System.out.println("not equal");
                        return;
                    }
                }
            }
            if (isEqual){
                System.out.println("equal");
            }
        }
    }
}