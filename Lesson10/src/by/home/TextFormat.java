package by.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFormat {
    private static boolean isChek = false;

    public static String[] getBreakIntoSentences(FileReader fileName) throws IOException {
        BufferedReader in = new BufferedReader(fileName);
        String str;
        String[] s = null;
        while ((str = in.readLine()) != null) {
            if (!str.isEmpty()) {
                s = str.split("\\. ");
            }
        }
        in.close();
        return s;
    }

    public static int getCountWordingString(String s) {
        String[] str = s.split(" ");
        return str.length;
    }

    public static boolean getPalindrome(String s) {
        String[] str = s.split(" ");
        StringBuilder stringBuilder;
        for (String s1 : str) {
            isChek = false;
            stringBuilder = new StringBuilder(s1);
            if (s1.length() > 1 && stringBuilder.reverse().toString().equalsIgnoreCase(s1)) {
                isChek = true;
                break;
            }
        }
        return isChek;
    }
}