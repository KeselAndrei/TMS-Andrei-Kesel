import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(1);
        countDevs(2);
        countDevs(3);
        countDevs(4);
        countDevs(5);
        countDevs(10);
        countDevs(11);
        countDevs(13);
        countDevs(15);
        countDevs(21);
        countDevs(103);
        countDevs(114);
        countDevs(10114);
        countDevs(10002);
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
        String programmer = " программист";
        int last;
        if (0 <= count && count <= 99) {
            last = count % 10;
            if (last == 1 && count != 11) {
                System.out.println(count + programmer);
            } else if (last >= 2 && last < 5 && count != 12 && count != 13 && count != 14) {
                System.out.println(count + programmer + "а");
            } else {
                System.out.println(count + programmer + "ов");
            }
        } else if (100 <= count && count <= 999) {
            last = count % 100;
            if (last > 11 && last < 19) {
                System.out.println(count + programmer + "ов");
            } else if (last % 10 > 1 && last < 5) {
                System.out.println(count + programmer + "а");
            } else if (last % 10 == 1 && last != 11) {
                System.out.println(count + programmer);
            } else {
                System.out.println(count + programmer + "ов");
            }
        } else if (1000 <= count && count <= 9999) {
            last = count % 1000;
            if (last > 11 && last < 19) {
                System.out.println(count + programmer + "ов");
            } else if (last % 10 >= 2 && last < 5) {
                System.out.println(count + programmer + "а");
            } else if (last % 10 == 1 && last != 11) {
                System.out.println(count + programmer);
            } else {
                System.out.println(count + programmer + "ов");
            }
        } else if (10000 <= count && count <= 99999) {
            last = count % 10000;
            if (last > 11 && last < 19) {
                System.out.println(count + programmer + "ов");
            } else if (last % 10 >= 2 && last < 5) {
                System.out.println(count + programmer + "а");
            } else if (last % 10 == 1 && last != 11) {
                System.out.println(count + programmer);
            } else {
                System.out.println(count + programmer + "ов");
            }
        } else if (100000 <= count && count <= 999999) {
            last = count % 100000;
            if (last > 11 && last < 19) {
                System.out.println(count + programmer + "ов");
            } else if (last % 10 >= 2 && last < 5) {
                System.out.println(count + programmer + "а");
            } else if (last % 10 == 1 && last != 11) {
                System.out.println(count + programmer);
            } else {
                System.out.println(count + programmer + "ов");
            }
        } else if (1000000 <= count && count <= 9999999) {
            last = count % 1000000;
            if (last > 11 && last < 19) {
                System.out.println(count + programmer + "ов");
            } else if (last % 10 >= 2 && last < 5) {
                System.out.println(count + programmer + "а");
            } else if (last % 10 == 1 && last != 11) {
                System.out.println(count + programmer);
            } else {
                System.out.println(count + programmer + "ов");
            }
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
        Scanner heightScanner = new Scanner(System.in);
        Scanner widthScanner = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.println("Введите положительное целое число");
            while (!widthScanner.hasNextInt() && !heightScanner.hasNext() || !widthScanner.hasNextInt() || !heightScanner.hasNext()) {
                System.out.println("Это не число!!!");
                widthScanner.next();
                heightScanner.next();
            }
            while (!widthScanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                widthScanner.next();
            }
            while (!heightScanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                heightScanner.next();
            }
            width = widthScanner.nextInt();
            height = heightScanner.nextInt();
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
        Scanner heightScanner = new Scanner(System.in);
        Scanner widthScanner = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.println("Введите положительное целое число");
            while (!widthScanner.hasNextInt() && !heightScanner.hasNext() || !widthScanner.hasNextInt() || !heightScanner.hasNext()) {
                System.out.println("Это не число!!!");
                widthScanner.next();
                heightScanner.next();
            }
            while (!widthScanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                widthScanner.next();
            }
            while (!heightScanner.hasNextInt()) {
                System.out.println("Это не число!!!");
                heightScanner.next();
            }
            width = widthScanner.nextInt();
            height = heightScanner.nextInt();
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