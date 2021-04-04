import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положительное целое число");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int operation(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i : ints) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void countDevs(int count) {
        String programer = " программист";
        int last = count % 10;
        if (last == 1 && count != 11) {
            System.out.println(count + programer);
        } else if (last >= 2 && last < 5 && count != 12 && count != 13 && count != 14) {
            System.out.println(count + programer + "а");
        } else {
            System.out.println(count + programer + "ов");
        }
    }

    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("foo");
        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("bar");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        }
    }

    public static void calculateSumOfDiagonalElements() {
        Scanner heightScaner = new Scanner(System.in);
        Scanner widthScaner = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.println("Введите положительное целое число");
            while (!widthScaner.hasNextInt() && !heightScaner.hasNext() || !widthScaner.hasNextInt() || !heightScaner.hasNext()) {
                System.out.println("Это не число!!!");
                widthScaner.next();
                heightScaner.next();
            }
            while (!widthScaner.hasNextInt()) {
                System.out.println("Это не число!!!");
                widthScaner.next();
            }
            while (!heightScaner.hasNextInt()) {
                System.out.println("Это не число!!!");
                heightScaner.next();
            }
            width = widthScaner.nextInt();
            height = heightScaner.nextInt();
        } while (width <= 0 || height <= 0);
        int[][] array = new int[width][height];
        Random random = new Random();
        int summaOfDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
                if (i == j) {
                    summaOfDiagonal += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Сумма элементов по диагонали = " + summaOfDiagonal);
    }

    public static void printMatrix() {
        Scanner heightScaner = new Scanner(System.in);
        Scanner widthScaner = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.println("Введите положительное целое число");
            while (!widthScaner.hasNextInt() && !heightScaner.hasNext() || !widthScaner.hasNextInt() || !heightScaner.hasNext()) {
                System.out.println("Это не число!!!");
                widthScaner.next();
                heightScaner.next();
            }
            while (!widthScaner.hasNextInt()) {
                System.out.println("Это не число!!!");
                widthScaner.next();
            }
            while (!heightScaner.hasNextInt()) {
                System.out.println("Это не число!!!");
                heightScaner.next();
            }
            width = widthScaner.nextInt();
            height = heightScaner.nextInt();
        } while (width <= 0 || height <= 0);
        int[][] array = new int[width][height];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] i : array) {
            for (int j : i) {
                if (j % 3 == 0) {
                    System.out.print("+ ");
                } else if (j % 7 == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printPrimeNumbers() {
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1)
                System.out.print(i + " ");
        }
    }
}