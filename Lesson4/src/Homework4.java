import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        cellDivision();
        System.out.println(summ(2, 4));
        System.out.println(summ(-2, -4));
        System.out.println(summ(-2, 4));
        mass(new int[100]);
        maxElement(new int[12]);
        array();
        maxElementChange();
        printMatrix();
        countNumbers(-50);
        countNumbers(50);
        countNumbers(-5000);
        countNumbers(500000000);
        countNumbers(0);
        differentElements(new int[]{0, 3, 46, 3, 2, 1, 2});
    }

    public static void cellDivision() {
        int count = 1;
        for (int i = 0; i <= 24; i += 3) {
            if (i != 0) {
                count = count * 2;
                System.out.print(count + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static int summ(int a, int b) {
        int sum = 0;
        for (int i = 0; i < Math.abs(a); i++) {
            sum += Math.abs(b);
        }
        if (a < 0 && b > 0 || b < 0 && a > 0) {
            return -sum;
        } else {
            return sum;
        }
    }

    public static void mass(int[] array) {
        System.out.println();
        for (int i = 1; i <= 100; i += 2) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int j = array.length - 1; j > 0; j -= 2) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void maxElement(int[] mass) {
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int max = mass[0];
        int maxIndex = 0;
        for (int j = 0; j < mass.length; j++) {
            if (max < mass[j]) {
                max = mass[j];
            }
            if (mass[j] == max) {
                maxIndex = j;
            }
        }
        System.out.println("Максимальный элемент в массиве равен: " + max + " индекс его последнего вхождения равен: " + maxIndex);
        System.out.println();
    }

    public static void array() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void maxElementChange() {
        int[] mass = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = mass[0];
        int cangeNull = mass[0];
        for (int j = 0; j < mass.length; j++) {
            if (max < mass[j]) {
                max = mass[j];
            }
            System.out.print(mass[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (max == mass[i]) {
                mass[i] = cangeNull;
            } else {
                mass[0] = max;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальный элемент равен - " + max);
        System.out.println();
    }

    public static void printMatrix() {
        Scanner heightScaner = new Scanner(System.in);
        int height;
        do {
            System.out.println("Введите положительное целое число");
            while (!heightScaner.hasNextInt()) {
                System.out.println("Это не число!!!");
                heightScaner.next();
            }
            height = heightScaner.nextInt();
        } while (height <= 0);
        int[][] array = new int[height][height];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        int[][] array1 = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array1[j][i] = array[i][j];
            }
        }
        for (int j = 0; j < array1.length; j++) {
            for (int k = 0; k < array1[j].length; k++) {
                System.out.print(array1[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void countNumbers(int a) {
        int count = (a == 0) ? 1 : 0;
        int b = a;
        while (b != 0) {
            count++;
            b /= 10;
        }
        positiveOrNegative(a, count);
    }

    public static void positiveOrNegative(int b, int count) {
        if (b < 0) {
            System.out.println(b + " это отрицательное число, количество цифр = " + count);
        } else if (b > 0) {
            System.out.println(b + " это положительное число, количество цифр = " + count);
        } else {
            System.out.println(b + " это Ноль, количество цифр = 1");
        }
    }

    public static void differentElements(int[] array) {
        System.out.println();
        Arrays.sort(array);
        int count = 0;
        int length = array.length;
        for (int i = 0, j = i + 1; i < length && j < length; i++, j++) {
            if (array[i] == array[j]) {
                count++;
            } else if (count > 0) {
                System.out.print("Массив имеет повторяющиеся элементы " + array[i] + ", ");
                count = 0;
            }
        }
    }
}