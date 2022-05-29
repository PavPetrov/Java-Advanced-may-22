import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("every-third-line.txt"));

        int lineCounter = 1;
        String line = bufferedReader.readLine();

        while (line != null){
            if(lineCounter % 3 == 0){
                printWriter.println(line);
            }
            line =bufferedReader.readLine();
            lineCounter++;
        }
        printWriter.close();
    }
}
