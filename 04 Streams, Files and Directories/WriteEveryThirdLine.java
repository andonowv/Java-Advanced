import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\Files-and-Streams\\input.txt";

        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);

        int currentLine = 1;

        while (scanner.hasNext()){
            if (currentLine % 3 == 0){
                System.out.println(scanner.nextLine());
            }else {
                scanner.nextLine();
            }
            currentLine++;
        }
    }
}
