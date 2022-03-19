import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class copyBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\Files-and-Streams\\input.txt";
        FileInputStream fileInputStream= new FileInputStream(path);

        int nextByte = fileInputStream.read();
        PrintStream printStream = new PrintStream("out.txt");
        while (nextByte!= -1){
            if (nextByte == 32){
                printStream.print(" ");
            }else if (nextByte == 10){
                printStream.println("");
            } else {
                printStream.print(nextByte);
            }
            nextByte = fileInputStream.read();
        }

    }
}
