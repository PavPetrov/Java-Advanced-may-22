import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02_Sum_Bytes {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader
                (new FileReader("10_ExerciseStreamsFilesAndDirectories\\input.txt"))) {
            String readLine = bufferedReader.readLine();
            int sum = 0;
            while (readLine != null) {
                for (char ch : readLine.toCharArray()) {
                    sum += ch;
                }

                readLine = bufferedReader.readLine();
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
