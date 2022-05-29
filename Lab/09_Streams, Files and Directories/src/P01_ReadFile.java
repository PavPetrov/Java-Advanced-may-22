import java.io.FileInputStream;
import java.io.IOException;

public class P01_ReadFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\HP\\IdeaProjects\\Java Advanced may 22\\09Lab_StreamsFilesAndDirectories\\input.txt";
        try {
            FileInputStream inputStream = new FileInputStream(path);
            int readData = inputStream.read();

            while (readData != -1){

                System.out.print(Integer.toBinaryString(readData)+" ");
                readData= inputStream.read();
            }

        } catch (IOException e){
            System.out.println(e);
        }
    }
}
