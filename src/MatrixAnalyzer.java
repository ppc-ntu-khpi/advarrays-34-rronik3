import java.util.Random;

/**
 * Утилітний клас для аналізу матриці.
 * Містить метод для знаходження індексу стовпця з максимальною сумою елементів.
 */
public class MatrixAnalyzer {

    /**
     * Знаходить індекс стовпця з максимальною сумою елементів.
     *
     * @param matrix двовимірна цілочислова матриця
     * @return індекс стовпця з максимальною сумою
     */
    public static int findColumnWithMaxSum(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return -1;

        int columns = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int j = 0; j < columns; j++) {
            int sum = 0;
            for (int[] ints : matrix) {
                sum += ints[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = j;
            }
        }

        return maxIndex;
    }

    /**
     * Створює та повертає матрицю заданого розміру з випадковими значеннями.
     *
     * @param rows кількість рядків
     * @param cols кількість стовпців
     * @return матриця заповнена випадковими числами
     */
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int[] row : matrix) {
            for (int j = 0; j < cols; j++) {
                row[j] = rand.nextInt(101); // числа від 0 до 100
            }
        }

        return matrix;
    }
}

