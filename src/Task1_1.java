import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_1 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        System.out.println("Вводите по одному целому числу и нажимайте Enter, " +
                "чтобы получить результат введите пустую строчку и нажмите Enter");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = reader.readLine();
            if (str.equals("")) {
                break;
            } else {
                if (Integer.parseInt(str) > 0) {
                    count++;
                }
            }

        }
        System.out.println("Количество положительных чисел = " + count);
    }
}

