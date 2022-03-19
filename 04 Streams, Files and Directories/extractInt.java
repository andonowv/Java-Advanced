import java.io.*;
import java.util.Scanner;

public class extractInt {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\Files-and-Streams\\input.txt";

        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        PrintStream printStream = new PrintStream("right.txt");
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                printStream.println(scanner.nextInt());
            }
            scanner.next();
        }
    }
}
