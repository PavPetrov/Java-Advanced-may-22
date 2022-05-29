import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class P07_ListFiles {
    public static void main(String[] args) throws IOException {
        //Files-and-Streams
        File root = new File("C:\\Users\\HP\\IdeaProjects\\" +
                "Java Advanced may 22\\09Lab_StreamsFilesAndDirectories\\Files-and-Streams");
        Arrays.stream(root.listFiles()).filter(File::isFile).
                forEach(file -> System.out.println(file.getName() + ": [" + file.length() +"]"));
    }
}
