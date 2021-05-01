package by.home;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] s = TextFormat.getBreakIntoSentences(new FileReader("d:\\Intellij IDEA Community Edition\\" +
                "TMS-Andrei-Kesel\\Lesson10\\src\\by\\home\\text.txt"));
        FileWriter writer = new FileWriter("d:\\Intellij IDEA Community Edition\\" +
                "TMS-Andrei-Kesel\\Lesson10\\src\\by\\home\\newText.txt");
        for (String value : s) {
            if (TextFormat.isPalindrome(value)) {
                writer.write(value + "\n");
                writer.flush();
            }
            if (TextFormat.getCountWordingString(value) >= 3 && TextFormat.getCountWordingString(value) <= 5) {
                writer.write(value + "\n");
                writer.flush();
            }
        }
        writer.close();
    }
}