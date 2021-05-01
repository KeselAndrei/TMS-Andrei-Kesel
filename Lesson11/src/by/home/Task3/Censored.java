package by.home.Task3;

import java.util.ArrayList;

public class Censored {
    private final BlackFile blackList;
    private final NewFile textList;

    public Censored(BlackFile blackList, NewFile textList) {
        this.blackList = blackList;
        this.textList = textList;
    }

    public void printResultCensored() {
        String[] listText = textList.read();
        String[] listBlack = blackList.read();
        int count = 0;
        ArrayList<String> strings = new ArrayList<>();
        for (String s : listText) {
            String[] str = ((s.trim()).split(" "));
            for (String value : str) {
                for (String item : listBlack) {
                    if (value.equalsIgnoreCase((item.trim()))) {
                        count++;
                        strings.add(s);
                    }
                }
            }
        }
        if (count > 0) {
            System.out.println("Следующие " + count + " предложения не прошли проверку: ");
            for (String string : strings) {
                System.out.println(string);
            }
        } else {
            System.out.println("Фаил прошел проверку на цензуру");
        }
    }
}