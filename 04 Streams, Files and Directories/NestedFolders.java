import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\andon\\Desktop\\Java\\Java Advanced\\04 Streams, Files and Directories\\Files-and-Streams");
        ArrayDeque <File> files = new ArrayDeque<>();

        files.offer(file);

        while (!files.isEmpty()){

            File innerFile = files.poll();

            for (File f : innerFile.listFiles()) {
                if (f.isDirectory()){
                    files.offer(f);
                }else{
                    System.out.println(f.getName());
                }
            }
        }
    }
}
