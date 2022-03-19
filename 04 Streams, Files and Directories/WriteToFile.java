import java.io.FileInputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\Files-and-Streams\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);

        int nextByte = fileInputStream.read();

        while (nextByte != -1){
            if ((char)nextByte == '.' || (char)nextByte==',' || (char)nextByte =='!' || (char)nextByte=='?'){
                System.out.print("");
            }else {
                System.out.print((char) nextByte);
            }
            nextByte = fileInputStream.read();
        }
    }
}
