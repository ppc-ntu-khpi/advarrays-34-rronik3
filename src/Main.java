import java.util.Arrays;
import java.util.Scanner;

/**
 * The Main class is used to test the functionality of the MatrixAnalyzer class.
 * It allows the user to generate a random matrix and find the column with the maximum sum.
 */
public class Main {

    /**
     * The main method is the entry point of the program.
     * It prompts the user to input the dimensions of the matrix, generates a random matrix,
     * displays it, and identifies the column with the maximum sum.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines (N): ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns (M): ");
        int cols = scanner.nextInt();

        // Generate a random matrix with the specified dimensions
        int[][] matrix = MatrixAnalyzer.generateRandomMatrix(rows, cols);

        // Display the generated matrix
        System.out.println("\nGenerated matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Find and display the column with the maximum sum
        int maxColumnIndex = MatrixAnalyzer.findColumnWithMaxSum(matrix);
        System.out.println("\nColumn with the maximum amount: " + maxColumnIndex);
    }
}

