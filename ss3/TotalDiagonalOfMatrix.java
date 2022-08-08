package ss3;

import java.util.Scanner;

public class TotalDiagonalOfMatrix {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the order of the matrix: ");
        n = scanner.nextInt();
        int A[][] = new int[n][n];

        System.out.println("Enter the elements for the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix A just imported:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonals of the matrix: " + sum);
    }
}
