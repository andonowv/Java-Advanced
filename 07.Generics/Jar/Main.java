package JarVol1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jar <String> particularJar = new Jar<>();

        particularJar.add("Ivan");
        particularJar.add("gosho");
        System.out.println("Test Passed!");
    }
}
