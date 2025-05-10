import java.util.Arrays;
import java.util.Scanner;

/**
 * Клас для тестування MatrixAnalyzer.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines (N): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (M): ");
        int cols = scanner.nextInt();

        int[][] matrix = MatrixAnalyzer.generateRandomMatrix(rows, cols);

        System.out.println("\nGenerated matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        int maxColumnIndex = MatrixAnalyzer.findColumnWithMaxSum(matrix);
        System.out.println("\nColumn with the maximum amount: " + maxColumnIndex);
    }
}

