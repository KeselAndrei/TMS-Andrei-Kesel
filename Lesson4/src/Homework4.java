import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        cellDivision();
        System.out.println(summ(2, 4));
        System.out.println(summ(-2, -4));
        System.out.println(summ(-2, 4));
        mass();
        maxElement();
        array();
        maxElementChange();
        printMatrix();
        countNumbers(-50);
        countNumbers(50);
        countNumbers(-5000);
        countNumbers(500000000);
    }

    public static void cellDivision() {
        int count = 1;
        for (int i = 0; i <= 24; i += 3) {
            if (i != 0 && i % 3 == 0) {
                count = count * 2;
                System.out.print(count + " ");
            }
        }
        System.out.println();
    }

    public static int summ(int a, int b) {
        int sum = 0;
        if (a < 0 && b < 0) {
            for (int i = 0; i < -a; i++) {
                sum += -b;
            }
            return sum;
        } else if (a > 0 && b > 0) {
            for (int i = 0; i < a; i++) {
                sum += b;
            }
            return sum;
        } else for (int i = 0; i < Math.max(a, b); i++) {
            sum += Math.min(a, b);
        }
        return sum;
    }

    public static void mass() {
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;
        }
        int[] mas = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                mas[b] = i;
                System.out.print(mas[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static void maxElement() {
        int[] mass = new int[12];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int max = mass[0];
        for (int j = 0; j < mass.length; j++) {
            if (max < mass[j]) {
                max = mass[j];
            }
        }
        int maxIndex = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == max) {
                maxIndex = i + 1;
            }

        }
        System.out.println("Максимальный элемент в массиве равен: " + max + " индекс его последнего вхождения равен: " + maxIndex);
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
        System.out.println("_________________________________");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void countNumbers(int a) {
        int count = (a == 0) ? 1 : 0;
        int b = a;
        if (a < 0) {
            while (b != 0) {
                count++;
                b /= 10;
            }
            System.out.println(a + " это отрицательное число, количество цифр = " + count);
        } else if (b > 0) {
            while (b != 0) {
                count++;
                b /= 10;
            }
            System.out.println(a + " это положительное число, количество цифр = " + count);
        }
    }
}