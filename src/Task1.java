import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int count = 0;//В Java есть правило: объявлять переменую нужно наиболее близко к место где вы будете ее использовать! Т.е ее надо удалить с 8 строчки и вставить между 12 и 13
        int a = (int) Math.random()*16+5; //Ваша логики всегда будет выдавать значени = 5 при любых обстоятельствах. Поэтому нету смысла писать (int) Math.random()*16+ Можно просто int a = 5; 
        System.out.println("Ведите "+ a + " " + "целых чисел: ");//Пробел " " можно в строке не делать, сделать во так System.out.println("Введите " + a + "целых чисел:");. В конце пробел тоже не нужен, т.к используете println, который переводит курсор на новую строку.
        args = new String[a];// это строчку можно удалить
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Код не отформатирован. 
            for (int i = 0;i< args.length;i++) {//тут вместо args.length использовать переменную а
                args[i] = reader.readLine();//тут делаем String inputLine = reader.readLine(); args[i] = уже не нужен и сразуже выполняем
                //if (Integer.parseInt(inputLine) > 0) {
                //    count++;
                //}
            }
        for (int i = 0;i< args.length;i++) {// этот for уже не нужен будет.
            if(Integer.parseInt(args[i])>0){
                count++;
            }
        }
        System.out.println(count);// необходимо добавить тескт "количество положительных чисел = " + count для более понятного ответа.
     }
}




