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
        triangle(new String[4][4]);
    }

//  1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//     сколько амеб будет через 3, 6, 9, 12,..., 24 часа

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

//  2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//     умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

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

//  5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//     а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

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

//  6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//     Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//     Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

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

//   7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//      Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//      Снова выведете массив на экран на отдельной строке.

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

// 8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

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

//  10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//      Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//      Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//      Пример:
//      1 2 3 4      1 6 3 1
//      6 7 8 9      2 7 3 5
//      3 3 4 5      3 8 4 6
//      1 5 6 7      4 9 5 7

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

//  4) В переменную записываем число.
//     Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//     Например, Введите число: 5
//     "5 - это положительное число, количество цифр = 1"

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

//  9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся

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
        System.out.println();
        System.out.println();
    }

//  3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    public static void triangle(String[][] array) {
        System.out.println("a");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j >= array.length - 1 - i) {
                    array[i][j] = "*";
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("b");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i >= j) {
                    array[i][j] = "*";
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("c");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i <= j) {
                    array[i][j] = "*";
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("d");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j <= array.length - 1 - i) {
                    array[i][j] = "*";
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}