import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List <String> lines = Files.readAllLines(path);
        int sum = 0;
        for (String line : lines) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
