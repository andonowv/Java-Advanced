import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int columns = rows;
        String type = input[1];

        int [][] matrix = new int[rows][columns];
        int a = 1;
        if (type.equals("A")){
            for (int col = 0; col < columns; col++) {
                for (int row = 0; row < columns; row++) {
                    matrix[row][col] = a;
                    a++;
                }
            }
            for (int col = 0; col < columns; col++) {
                for (int row = 0; row < columns; row++) {
                    System.out.printf("%d ", matrix[col][row]);
                }
                System.out.println();
            }
        }else if (type.equals("B")){
            for (int col = 0; col < columns; col++) {
                if (col%2 == 0) {
                    for (int row = 0; row < columns; row++) {
                        matrix[row][col] = a;
                        a++;
                    }
                }else {
                    for (int row = columns -1 ; row >= 0; row--) {
                        matrix[row][col] = a;
                        a++;
                }
            }
        }
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.printf("%d ", matrix[i][j]);
                }
                System.out.println();
            }
    }
}}
