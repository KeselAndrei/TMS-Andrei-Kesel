import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collection;

public class Task1_1 {
    public static void main(String[] args) throws IOException {
        int count = 0;//перенести вниз между 12 и 13 сточкой.
        ArrayList<Integer> collection = new ArrayList<>();// можно не использовать, а сразу делать подсчет положительных чисел в цикле while
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//добваить текст например (Введите по одному целому числу и нажимайте ентер, чтобы получить результат введите пустую сточку и нажмите ентер)
        while (true) {
            String str = reader.readLine();
            if (str.equals("")) {
                break;
            }// написать else и сделать if(Integer.parseInt(str)>0) то count++;
            collection.add(Integer.parseInt(str));
        }
        for (int i = 0;i<collection.size();i++){// этот фор уже не нужне будет, т.к count будет посчитан в цикле while
            if (collection.get(i)>0){
                count++;
            }
        }
        System.out.println(count);//добавить текст
    }
}

