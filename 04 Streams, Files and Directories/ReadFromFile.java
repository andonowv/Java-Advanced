import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\Files-and-Streams\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        int nextByte = fileInputStream.read();
        while (nextByte!= -1){
            System.out.print(Integer.toBinaryString(nextByte) + " ");
            nextByte = fileInputStream.read();
        }
    }
}
