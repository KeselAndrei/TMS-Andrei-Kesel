package by.home1;

import java.util.ArrayList;

public class Main {
    public static ArrayList<String> arrayList;

    public static void main(String[] args) {
        System.out.println(stripSubstringFromString("вымысел", "ы", "с"));
        System.out.println(getReplace("Стоматолог машину мыл"));
        System.out.println(stripSubstringFromString("навымысел", "с", "л"));
        System.out.println(getReplace("мама мыла раму"));
        arrayList = new ArrayList<>();
        arrayList.add("казаК");
        arrayList.add("дед");
        arrayList.add("ель");
        arrayList.add("путь");
        arrayList.add("алла");
        arrayList.add("шалаш");
        arrayList.add("Маам");
        printPalindrome();
    }

    private static String getReplace(String str) {
        return str.replace(str.charAt(3), str.charAt(0));
    }

    private static String stripSubstringFromString(String str, String ch1, String ch2) {
        int i = str.indexOf(ch1);
        int j = str.indexOf(ch2) + 1;
        return str.substring(i, j);
    }

    private static void printPalindrome() {
        for (String s : getPalindrome(arrayList)) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> getPalindrome(ArrayList<String> arrayList) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        StringBuilder stringBuilder;
        for (String s5 : arrayList) {
            String s6 = s5.toLowerCase();
            stringBuilder = new StringBuilder(s6);
            if (stringBuilder.reverse().toString().equals(s6)) {
                arrayList1.add(s6);
            }
        }
        return arrayList1;
    }
}