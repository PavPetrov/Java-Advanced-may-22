import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P05_LineNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter("10_ExerciseStreamsFilesAndDirectories\\output.txt")) {
            Path inputPath = Paths.get("10_ExerciseStreamsFilesAndDirectories\\inputLineNumbers.txt");
            List<String> lines = Files.readAllLines(inputPath);

            for (int i = 0; i < lines.size(); i++) {
                pw.printf("%d. %s%n", i + 1, lines.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
