import java.util.Random;

/**
 * Утилітний клас для аналізу матриці.
 * Містить методи для знаходження індексу стовпця з максимальною сумою елементів
 * та генерації випадкової матриці заданого розміру.
 */
public class MatrixAnalyzer {

    /**
     * Знаходить індекс стовпця з максимальною сумою елементів.
     *
     * @param matrix двовимірна цілочислова матриця
     * @return індекс стовпця з максимальною сумою або -1, якщо матриця порожня
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
     * @param rows кількість рядків у матриці
     * @param cols кількість стовпців у матриці
     * @return двовимірна матриця, заповнена випадковими числами від 0 до 100
     * @throws IllegalArgumentException якщо кількість рядків або стовпців менше 1
     */
    public static int[][] generateRandomMatrix(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new IllegalArgumentException("Кількість рядків і стовпців повинна бути більше 0.");
        }

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

