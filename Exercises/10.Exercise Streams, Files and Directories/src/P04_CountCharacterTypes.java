import java.io.*;
import java.util.Locale;

public class P04_CountCharacterTypes {
    public static void main(String[] args) {
        //•	a, e, i, o, u are vowels, only lower case.
        //•	All others are consonants.
        //•	Punctuation marks are (! , . ?).
        //•	Do not count whitespace.

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        try (FileReader fr = new FileReader("10_ExerciseStreamsFilesAndDirectories\\input.txt");
             PrintWriter pw = new PrintWriter("10_ExerciseStreamsFilesAndDirectories\\output.txt")) {
            int symbol = fr.read();
            while (symbol >= 0) {
                char symbolAsChar = (char) symbol;

                if (isVowels(symbolAsChar)) {
                    vowels++;
                } else if (isPunctuation(symbolAsChar)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbolAsChar)) {  // &&!Character.isDigit(symbolAsChar)
                    consonants++;
                }
                symbol = fr.read();
            }
            //Vowels: 41
            //Consonants: 72
            //Punctuation: 6

            pw.println("Vowels: " + vowels);
            pw.println("Consonants: " + consonants);
            pw.println("Punctuation: " + punctuation);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPunctuation(char symbol) {
        return (symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',');
    }

    private static boolean isVowels(char symbol) {
        String s = symbol + "".toLowerCase();
        symbol = s.charAt(0);
        return (symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'i' || symbol == 'e');

    }
}
