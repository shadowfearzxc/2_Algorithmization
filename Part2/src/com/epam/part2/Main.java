package com.epam.part2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// unit2 Introduction to Java EPAM
// 2_Algorithmization
// Part 1 - arrays[] (task 1 - 10)
// Part 2 - Tasks. Arrays of arrays (task 11 - 26)
// Part 3 - Декомпозиция ( task 35 - )
// starting coding 15.07.2022 (4:59 PM)
// Ending coding 00.10.2022 (0:00 )

public class Main {
    public static void main(String[] args) {
        allTasks();
    }

    public static void allTasks() {
        //task01();
        /*task02();
        task03();
        task04();
        task05();
        task06();
        //task07();
        //task08();
        //task09();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
        task24();
        task25(); */
        //task35();
        task36();
    }

        private static void task01 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ЗАДАЧА 1 : ");
            System.out.print("Введите размерность массива : "); int n = scanner.nextInt();;
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.print(Arrays.toString(array) + "\n");
            System.out.print("Введите K : "); int k = scanner.nextInt();
            int sum = 0;
            for (int value : array) {
                if (value % k == 0) {
                    sum += value;
                }
            }
            System.out.print("Сумма элементов, которые кратны " + k + " : " + sum);
        }

        private static void task02 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nЗАДАЧА 2 : ");
            System.out.print("Введите размерность массива : "); int n = scanner.nextInt();
            int[] array = new int[n];
            System.out.print("Введите число Z : "); int z = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.print(Arrays.toString(array) + "\n");
            for (int i = 0; i < array.length; i++) {
                if (array[i] > z) {
                    array[i] = z;
                    count++;
                }
            }
            System.out.println(Arrays.toString(array) + "\n" + "Количество замен : " + count);
        }

        private static void task03 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nЗАДАЧА 3 : ");
            System.out.print("Введите размерность массива : "); int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100 - 50);
            }
            System.out.println(Arrays.toString(array) + "\n");
            int minus = 0; int plus = 0; int zero = 0;
            for (int j : array) {
                if (j < 0) {
                    minus++;
                } else if (j > 0) {
                    plus++;
                } else {
                    zero++;
                }
            }
            System.out.println("Количество положительных : " + plus + "\nКоличество отрицательных : " + minus + "\nКоличество нулевых : " + zero);
        }

        private static void task04 () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размерность массива : "); int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100 - 50);
            }
            System.out.println(Arrays.toString(array) + "\n");
            int min = 0, max = 0, swap;
            for (int i = 0; i < array.length; i++) {
                if (array[max] < array[i]) {
                    max = i;
                } else if (array[min] > array[i]) {
                    min = i;
                }
            }
            System.out.println("max = " + array[max] + "min = " + array[min]);
            swap = array[max];
            array[max] = array[min];
            array[min] = swap;
            System.out.print(Arrays.toString(array) + "\n");
        }

        private static void task05 () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размерность массива : "); int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100 - 50);
            }
            System.out.println(Arrays.toString(array) + "\n");
            for (int value : array) {
                if (value > array.length) {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
        private static void task06 () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размерность массива : "); int n = scanner.nextInt();
            double[] array = new double[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100 - 5);
            }
            System.out.println(Arrays.toString(array) + "\n");

            double sum = 0;
            nextPrime:
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j < i; i++) {
                    if (i % j == 0) {
                        continue nextPrime;
                    }
                }
                sum += array[i];
                System.out.println("Prime number " + i + "element of array " + array[i]);
            }
            System.out.println("sum is " + sum);

        }

        private static void task10 () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размерность массива : "); int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100 - 50);
            }
            System.out.println(Arrays.toString(array) + "\n");
            for (int i = 1; i < array.length; i += 2) {
                array[i] = 0;
            }
            System.out.println(Arrays.toString(array) + "\n");
        }

        // part 2 Tasks. Arrays of arrays
        private static void task11 () {
            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Введите количество строк"); int n = Integer.parseInt(read.readLine());
                System.out.println("Введите количество колонок"); int m = Integer.parseInt(read.readLine());
                int[][] matrix = new int[n][m];
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                        matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();

                //Output result of matrix
                for (int[] ints : matrix) {
                    for (int j = 0; j < ints.length; j++) {
                        if (j % 2 == 0 && matrix[0][j] > matrix[n - 1][j])
                            System.out.printf(" %3d", ints[j]);
                    }
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void task12 () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество строк : "); int n = scanner.nextInt();
            System.out.print("Введите количество колонок : ");int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println("Диагонали : ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                }
            }
            System.out.println();
            System.out.println("Диагонали : ");
            for (int i = matrix.length - 1; i >= 0; i--) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i + j == matrix.length - 1) {
                        System.out.printf("%3d  ", matrix[i][j]);
                    }
                }
                System.out.println();
            }
        }

        private static void task13 () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество строк : "); int n = scanner.nextInt();
            System.out.print("Введите количество колонок : "); int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            // method
            System.out.print("Введите количество k строку : "); int k = scanner.nextInt();
            System.out.print("Введите количество p колонку : "); int p = scanner.nextInt();
            System.out.println(" Строка :");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == k - 1) {
                        System.out.printf("%3d ", matrix[i][j]);
                    }

                }
            }
            System.out.println("\nКолонка: ");
            for (int[] ints : matrix) {
                for (int j = 0; j < ints.length; j++) {
                    if (j == p - 1) {
                        System.out.printf("%3d ", ints[j]);

                    }
                }
            }
        }

        private static void task14 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите квадратную матрицу n  : "); int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            int count = 0; int nDecriment = 0;
            if (n % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i % 2 == 0) {
                            count++;
                            matrix[i][j] = count;
                            System.out.printf("%3d ", matrix[i][j]);
                        } else {
                            nDecriment++;
                            matrix[i][j] = (n + 1) - nDecriment;
                            System.out.printf("%3d ", matrix[i][j]);
                        }
                    }
                    count = 0;
                    nDecriment = 0;
                    System.out.println();
                }
            } else {
                System.out.println("Number n is odd!");
            }

        }

        private static void task15 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите квадратную матрицу n : "); int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            if (n % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i > 0) {
                            if (n - (i + j) <= 0) {
                                matrix[i][j] = 0;
                            } else {
                                matrix[i][j] = i + 1;
                            }
                            System.out.printf("%3d ", matrix[i][j]);
                        } else {
                            matrix[i][j] = 1;
                            System.out.printf("%3d ", matrix[i][j]);
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Number n is odd!");
            }

        }

        private static void task16 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите квадратную матрицу n : "); int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            if (n % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                            matrix[i][j] = 1;
                        } else {
                            matrix[i][j] = 0;
                        }
                        System.out.printf("%2d ", matrix[i][j]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Number N is odd ");
            }

        }

        private static void task17 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите квадратную матрицу n : ");
            int n = scanner.nextInt();
            double[][] matrix = new double[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Math.sin((i * i - j * j) / n);
                    System.out.printf("%10f", matrix[i][j]);
                }
                System.out.println();
            }
            int count = 0;
            for (double[] array : matrix) {
                for (double element : array) {
                    if (element > 0) {
                        count++;
                    }
                }
            }
            System.out.printf("%n Количество положительных чисел : %d", count);

        }

        private static void task18 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количестов строк : "); int n = scanner.nextInt();
            System.out.print("Введите количестов колонок : ");int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            int swap;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Выберите число которое вы хотите поменять : "); int s = scanner.nextInt();
            s = s - 1;
            System.out.println("Выберите число которое вы хотите поменять : "); int z = scanner.nextInt();
            z = z - 1;
            for (int i = 0; i < matrix.length; i++) {
                swap = matrix[i][s];
                matrix[i][s] = matrix[i][z];
                matrix[i][z] = swap;
            }
            for (int[] array : matrix) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        }

        private static void task19 () {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество строк : "); int n = scanner.nextInt();
            System.out.print("Введите количество колонок : "); int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 100);
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            int maxColumn = 1;
            int maxSum = 0;
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                for (int[] ints : matrix) {
                    sum += ints[j];
                }
                System.out.printf("%nCумма элементов в колонке :  №%d: %d", j + 1, sum);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxColumn = j + 1;
                }
                sum = 0;
            }

            System.out.printf("\n\nColumn №%d consists max sum.", maxColumn);


        }

        private static void task20 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите квадратную матрицу : ");int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 100 - 50);
                    System.out.printf("%3d", matrix[i][j]);
                }
                System.out.println();

            }
            // main diagonale
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
            System.out.println("\nположительные элементы главной диагонали : ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j && matrix[i][j] > 0) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }


        }

        private static void task21 () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строки : "); int m = scanner.nextInt();
            System.out.print("Введите колонки : "); int n = scanner.nextInt();
            int[][] matrix = new int[m][n];
            int min = 0; int max = 15; int CountString = 1;
            for (int i = 0; i < matrix.length; i++) {

                System.out.print("[" + CountString + "]");
                CountString++;
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) ((Math.random() * (max - min)) + min);
                    System.out.printf("%3d", matrix[i][j]);
                }

                System.out.println();
            }
            System.out.println();
            int count;
            System.out.println("\nNumber of string, where digit 5 meets three or more times: ");
            for (int i = 0; i < matrix.length; i++) {
                count = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 5) {
                        count++;
                    }
                }
                if (count >= 3) {
                    System.out.printf("%d, ", i + 1);
                }
            }

        }

        private static void task22 () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите строки : "); int n = scanner.nextInt();
            System.out.println("Введите колонки : "); int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
            }

            System.out.println();

            boolean isSorted;
            int swap;
            System.out.println("Sorting by ascending ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] > matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }

            System.out.println("\nSorting by descending  ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] < matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
        }

        private static void task23 () {
            System.out.println();
            int swap;
            boolean isSorted;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строки  ");
            int n = scanner.nextInt();
            System.out.print("Введите колонки ");
            int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println("\nSorting by ascending ");
            for (int j = 0; j < matrix[0].length; j++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < matrix.length - 1; i++) {
                        if (matrix[i][j] > matrix[i + 1][j]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i + 1][j];
                            matrix[i + 1][j] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
            System.out.println("\nSorting by descending  ");
            for (int j = 0; j < matrix[0].length; j++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < matrix.length - 1; i++) {
                        if (matrix[i][j] < matrix[i + 1][j]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i + 1][j];
                            matrix[i + 1][j] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
        }

        private static void task24 () {
            System.out.println("Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число\n" +
                    "единиц равно номеру столбца");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строки : ");
            int n = scanner.nextInt();
            System.out.print("Введите колонки : ");
            int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            if (m == n) {
                int count;
                for (int i = 0; i < matrix.length; i++) {
                    count = i + 1;
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (count - 1 > 0) {
                            matrix[i][j] = 0;
                            count--;
                        } else {
                            matrix[i][j] = 1;
                        }
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                    System.out.println();
                }
            } else System.out.println("If you want to get correct answer please enter m = n! ");
        }

        private static void task25 () {
            System.out.println("15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строки : ");
            int n = scanner.nextInt();
            System.out.print("Введите колонки : ");
            int m = scanner.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
            }
            System.out.println();
            int max = Integer.MIN_VALUE;
            for (int[] array : matrix) {
                for (int element : array) {
                    if (element > max) {
                        max = element;
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] % 2 != 0) {
                        matrix[i][j] = max;
                    }
                }
            }
            for (int[] array : matrix) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        }

        private static void task35 () {
            System.out.println("\nЗАДАЧА 35 : ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите A : "); int a = scanner.nextInt();
            System.out.print("Введите B : "); int b = scanner.nextInt();
            System.out.print("НОД равен : ");
            final int x = b == 0 ? a : a % b;
            System.out.println(x);
            System.out.print("НОК равен : ");
            System.out.println((a * b) / (x));


        }

        private static void task36() {


        }
    }

