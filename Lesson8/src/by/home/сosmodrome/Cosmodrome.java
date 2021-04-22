package by.home.сosmodrome;

public class Cosmodrome {
    void launch(IStart iStart) {
        if (!iStart.firstSystemCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.startEngine();
            countdown();
            iStart.start();
        }
    }

    private void countdown() {
        int i = 10;
        while (i >= 0) {
            System.out.print("\b\b");
            System.out.print(i);
            try {
                i--;
                Thread.sleep(1000L);
            } catch (Exception ignored) {

            }
        }
        System.out.println();
    }
}