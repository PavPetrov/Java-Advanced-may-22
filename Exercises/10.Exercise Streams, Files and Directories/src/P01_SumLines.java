import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P01_SumLines {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader("10_ExerciseStreamsFilesAndDirectories\\input.txt"))) {
            String readLine = bufferedReader.readLine();
            while (readLine != null) {

                int sum = 0;

                for (char ch : readLine.toCharArray()) {
                    sum += ch;
                }
                System.out.println(sum);

                readLine = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
