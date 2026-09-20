import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int m = sc.nextInt();

        int[][] marks = new int[n][m];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < m; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        int highestTotal = 0;
        int highestStudent = 0;

        // Calculate total and average
        System.out.println("\nStudent Results:");

        for (int i = 0; i < n; i++) {

            int total = 0;

            for (int j = 0; j < m; j++) {
                total = total + marks[i][j];
            }

            double average = (double) total / m;

            System.out.println("Student " + (i + 1)
                    + " -> Total = " + total
                    + ", Average = " + average);

            if (total > highestTotal) {
                highestTotal = total;
                highestStudent = i;
            }
        }

        System.out.println("\nStudent with highest total marks:");
        System.out.println("Student " + (highestStudent + 1)
                + " with total marks = " + highestTotal);

        sc.close();
    }
}