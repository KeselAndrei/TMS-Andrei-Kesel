import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int a = (int) Math.random()*16+5;
        System.out.println("Ведите "+ a + " " + "целых чисел: ");
        args = new String[a];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0;i< args.length;i++) {
                args[i] = reader.readLine();
            }
        for (int i = 0;i< args.length;i++) {
            if(Integer.parseInt(args[i])>0){
                count++;
            }
        }
        System.out.println(count);
    }
}




