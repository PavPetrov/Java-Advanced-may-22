import java.io.*;
import java.util.Scanner;

public class P04_ExtractInteger {
    public static void main(String[] args) throws IOException {

        String inputPath = "C:\\Users\\HP\\IdeaProjects\\Java Advanced may 22\\" +
                "09Lab_StreamsFilesAndDirectories\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(inputPath);
        Scanner scanner = new Scanner(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("integers.txt");
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){

              //  printWriter.println(scanner.next());
            }
            scanner.next();
        }
        printWriter.close();
    }
}
