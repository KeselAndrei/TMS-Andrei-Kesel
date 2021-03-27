import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collection;

public class Task1_1 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        ArrayList<Integer> collection = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = reader.readLine();
            if (str.equals("")) {
                break;
            }
            collection.add(Integer.parseInt(str));
        }
        for (int i = 0;i<collection.size();i++){
            if (collection.get(i)>0){
                count++;
            }
        }
        System.out.println(count);
    }
}

