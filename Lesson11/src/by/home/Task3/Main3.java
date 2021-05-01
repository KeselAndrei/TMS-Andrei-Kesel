package by.home.Task3;

public class Main3 {
    public static void main(String[] args) {
        Censored result1 = new Censored(new BlackFile("Lesson11/resources/black_list"),
                new NewFile("Lesson11/resources/text_list_new"));
        Censored result2 = new Censored(new BlackFile("Lesson11/resources/black_list"),
                new NewFile("Lesson11/resources/text_list"));
        result1.printResultCensored();
        result2.printResultCensored();
    }
}
