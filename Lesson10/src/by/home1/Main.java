package by.home1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(stripSubstringFromString("вымысел", "ы", "с"));
        System.out.println(getReplace("Стоматолог машину мыл"));
        System.out.println(stripSubstringFromString("навымысел", "с", "л"));
        System.out.println(getReplace("мама мыла раму"));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("казаК");
        arrayList.add("дед");
        arrayList.add("ель");
        arrayList.add("путь");
        arrayList.add("алла");
        arrayList.add("шалаш");
        arrayList.add("Маам");
        printPalindrome(arrayList);
    }

    private static String getReplace(String str) {
        return str.replace(str.charAt(3), str.charAt(0));
    }

    private static String stripSubstringFromString(String str, String ch1, String ch2) {
        int i = str.indexOf(ch1);
        int j = str.lastIndexOf(ch2) + 1;
        return str.substring(i, j);
    }

    private static void printPalindrome(ArrayList<String> arrayList) {
        for (String s : arrayList) {
            if (isPalindrome(s)) {
                System.out.println(s);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }
}