import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner wordScanner = new Scanner(new FileReader("10_ExerciseStreamsFilesAndDirectories\\words.txt"));
             Scanner textScanner = new Scanner(new FileReader("10_ExerciseStreamsFilesAndDirectories\\text.txt"));
             PrintWriter pw = new PrintWriter("10_ExerciseStreamsFilesAndDirectories\\results.txt")) {
            Map<String, Integer> wordCount = new LinkedHashMap<>();
            Arrays.stream(wordScanner.nextLine().split(" ")).forEach(w -> wordCount.put(w, 0));

            while(textScanner.hasNext()){
                String textWord = textScanner.next();
                if(wordCount.containsKey(textWord)){
                   int count =  wordCount.get(textWord);
                   wordCount.put(textWord, ++count);
                }
            }
            wordCount.forEach((s, integer) -> pw.println(s +" - " + integer));
        }
    }
}
