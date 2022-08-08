package ss3;

import java.util.Scanner;

public class SmallestValueInArray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        int i = 0;
        while (i < number.length) {
            System.out.print("Enter element:");
            number[i] = scanner.nextInt();
            i++;
        }
        System.out.print("The elements are: ");
        for (int j = 0; j < number.length; j++) {
            System.out.print("\t" + number[j]);
        }
        int min = number[0];
        for (int j = 0; j < number.length; j++) {
            if (number[j] < min) {
                min = number[j];

            }
        }
        System.out.println("The smallest element is " + min);


    }
}