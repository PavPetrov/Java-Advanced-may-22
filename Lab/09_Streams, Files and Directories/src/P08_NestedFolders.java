import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class P08_NestedFolders {
    public static void main(String[] args) throws IOException {

        File root = new File("C:\\Users\\HP\\IdeaProjects\\" +
                "Java Advanced may 22\\09Lab_StreamsFilesAndDirectories\\Files-and-Streams");
        Path path = Path.of("C:\\Users\\HP\\IdeaProjects\\" +
                "Java Advanced may 22\\09Lab_StreamsFilesAndDirectories\\Files-and-Streams");


        List<String> dirList = Files.walk(root.toPath())
                .map(Path::toFile).filter(File::isDirectory).map(File::getName).collect(Collectors.toList());

        for (String dir : dirList) {
            System.out.println(dir);
        }
        System.out.println(dirList.size() +" folders");
        
    }
}
