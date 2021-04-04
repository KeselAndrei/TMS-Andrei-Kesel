public class Homework3_void_countDevs {
    public static void main(String[] args) {
        System.out.println(countDevs(1));

    }

    public static String countDevs(int count) {
        String programer = " программист";
        int last = count % 10;
        if (last == 1 && count != 11) {
            return count + programer;
        } else if (last >= 2 && last < 5 && count != 12 && count != 13 && count != 14) {
            return count + programer + "а";
        } else {
            return count + programer + "ов";
        }
    }
}
