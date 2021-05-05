package by.home.Task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SearchPolindromInFile {
    public static void textWriteFile(String file1, String file2) {
        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream(file2)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            System.out.println("Прочитано из файла " + fileInputStream.read(bytes) + " byte");
            String[] str = new String(bytes).split("\\.");
            for (String value : str) {
                if (isPalindrome(value.trim())) {
                    fileOutputStream.write((value.getBytes(StandardCharsets.UTF_8)));
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}
