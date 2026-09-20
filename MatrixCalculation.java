import java.util.Scanner;

public class MatrixCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter no columns:");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nRow Calculation:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            int product = 1;
            for (int j = 0; j < columns; j++) {
                sum = sum + matrix[i][j];
                product = product * matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + "-> Sum = " + sum + ",Multiplication =" + product);
        }
        System.out.println("\nColumn Calculation");
        for (int j = 0; j < columns; j++) {
            int sum = 0;
            int product = 1;

            for (int i = 0; i < rows; i++) {
                sum = sum + matrix[i][j];
                product = product * matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + "-> Sum = " + sum + ",Multiplication = " + product);
        }
        sc.close();
    }
}
