package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersOneColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array length: ");
        int n = scanner.nextInt();

        System.out.print("Enter the length of the subarray: ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.printf("Enter sub-array element [%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter the column you want to delete: ");
        int pillar = scanner.nextInt();
        int result = 0;
        for ( i = 0; i < n ; i++) {
            for ( j = 0; j <m ; j++) {
                if (j==(pillar-1)){
                    result+=arr[i][j];
                }
            }
        }
        System.out.println("Total column: " + result);
    }
}
