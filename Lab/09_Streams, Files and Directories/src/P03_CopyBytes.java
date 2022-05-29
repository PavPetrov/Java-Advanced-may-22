import java.io.*;

public class P03_CopyBytes {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\HP\\IdeaProjects\\Java Advanced may 22\\" +
                "09Lab_StreamsFilesAndDirectories\\input.txt";
        try {
            FileInputStream inputStream = new FileInputStream(inputPath);
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            PrintStream printStream = new PrintStream(outputStream);
            PrintWriter printWriter = new PrintWriter(outputStream);

            int readByte = inputStream.read();
            while (readByte != -1) {
                if (readByte == ' ') {
                    printStream.print(" ");
                    //           printWriter.print(" ");
                } else if (readByte == 10) {
                    printStream.println();
                    //           printWriter.println();
                } else {
                    printStream.print(String.valueOf(readByte));
                    //             printWriter.print(readByte);
                }
                readByte = inputStream.read();
            }
           // printWriter.close();
            //      printStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
