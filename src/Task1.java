import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int a = 5;
        System.out.println("Ведите " + a + " целых чисел:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
            for (int i = 0; i < a; i++) {
                String inputLine = reader.readLine();
                if (Integer.parseInt(inputLine) > 0) {
                    count++;
                }
            }
        System.out.println("Количество положительных чисел = " + count);
    }
}




