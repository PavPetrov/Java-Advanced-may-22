import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02_WriteToFIe {
    public static void main(String[] args) {

        String path = "C:\\Users\\HP\\IdeaProjects\\Java Advanced may 22\\09Lab_StreamsFilesAndDirectories\\input.txt";
        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            int readData = inputStream.read(); // Read 1 byte from file
            //",", ".", "!", "?".

            Set<Character> punctuation = Set.of(',', '.', '!', '?');
            while (readData != -1) {
                if (!punctuation.contains((char) readData)){

                    outputStream.write(readData);
                }
       /*         String output = Integer.toBinaryString(readData) + " ";
                for (char c : output.toCharArray()) {
                    outputStream.write(c);
                }*/

                readData = inputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
