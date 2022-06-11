import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class P07_MergeTwoFiles {
    public static void main(String[] args) {
        Path inputOne = Paths.get("10_ExerciseStreamsFilesAndDirectories\\inputOne.txt");
        Path inputTwo = Paths.get("10_ExerciseStreamsFilesAndDirectories\\inputTwo.txt");
        Path merge = Paths.get("10_ExerciseStreamsFilesAndDirectories\\output.txt");
        try{
            List<String> fileOne = Files.readAllLines(inputOne);
            List<String> fileTwo = Files.readAllLines(inputTwo);
            Files.write(merge, fileOne, StandardOpenOption.APPEND);
            Files.write(merge, fileTwo, StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
