public class Task_1 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            if (Integer.parseInt(arg) > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных чисел = " + count);
    }
}