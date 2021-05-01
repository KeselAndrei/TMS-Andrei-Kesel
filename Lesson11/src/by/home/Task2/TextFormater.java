package by.home.Task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TextFormater {
    private static boolean isChek = false;

    public static void textWriteFile(String file1, String file2) {
        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream(file2)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            System.out.println("Прочитано из файла " + fileInputStream.read(bytes) + " byte");
            String[] str = new String(bytes).split("\\. ");
            for (String value : str) {
                if (TextFormater.isPalindrome(value)) {
                    fileOutputStream.write((value.getBytes(StandardCharsets.UTF_8)));
                    fileOutputStream.write(("\n".getBytes(StandardCharsets.UTF_8)));
                }
                if (TextFormater.getCountWordingString(value) >= 3 && TextFormater.getCountWordingString(value) <= 5) {
                    fileOutputStream.write(value.getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.write(("\n".getBytes(StandardCharsets.UTF_8)));
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static int getCountWordingString(String s) {
        String[] str = s.split(" ");
        return str.length;
    }

    private static boolean isPalindrome(String s) {
        String[] str = s.split(" ");
        StringBuilder stringBuilder;
        for (String s1 : str) {
            isChek = false;
            String s2 = s1.toLowerCase();
            stringBuilder = new StringBuilder(s2);
            if (stringBuilder.reverse().toString().equals(s2) && s1.length() > 1) {
                isChek = true;
                break;
            }
        }
        return isChek;
    }
}