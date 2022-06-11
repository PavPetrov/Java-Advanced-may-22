import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class P03_ALL_CAPITALS {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader("10_ExerciseStreamsFilesAndDirectories\\input.txt"));
             PrintWriter printWriter = new PrintWriter("10_ExerciseStreamsFilesAndDirectories\\output.txt")) {

            bufferedReader.lines().forEach(line -> printWriter.println(line.toUpperCase()));
            /*String readLine = bufferedReader.readLine();
            while (readLine != null){
                String upperCaseLine = readLine.toUpperCase();
                printWriter.println(upperCaseLine);
                readLine = bufferedReader.readLine();
            }*/


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

