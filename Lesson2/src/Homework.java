public class Homework {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3, 4));
    }

    public static int sum(int a, int b) {
        long summa = (long) a + (long) b;
        if (summa > Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) summa;
        }
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double average(int[] array) {
        int summa = 0;
        for (int i : array) {
            summa += i;
        }
        return (double) summa / array.length;
    }

    public static int max(int[] array) {
        int max;
        try {
            max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Колличество элементов в массиве = ");
            return 0;
        }
    }

    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}