import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\Files-and-Streams\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String line = bufferedReader.readLine();
        List <String> lineText = new ArrayList<>();
        while (line != null){
            lineText.add(line);
            line = bufferedReader.readLine();
        }
        Collections.sort(lineText);
        for (String s : lineText) {
            System.out.println(s);
        }
    }
}
