package GenericArrayCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] element = create(6, "element");
    }
    public static <T> T[] create(int length, T element){
        T [] arr = (T[]) new Object[length];
    }
}
