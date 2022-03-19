import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class allCapitals {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = Files.readAllLines(path);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        for (String line : lines) {
            bufferedWriter.write(line.toUpperCase(Locale.ROOT));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
