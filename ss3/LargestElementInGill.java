package ss3;
import java.util.Scanner;

public class LargestElementInGill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] number;

        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size <= 10: ");
        } while (size > 10);
        number = new int[size];
        int i = 0;
        while (i < number.length){
            System.out.print("Enter elements " + (i + 1) + ": ");
            number[i] = scanner.nextInt();
            i++;

        }
        System.out.print("The elements are: ");
        for (int j = 0; j < number.length; j++) {
            System.out.print("\t" + number[j]);

        }
        int max = number[0];
        int index = 1;
        for (int j = 0; j < number.length; j++) {
            if (number[j] > max) {
                max = number[j];
                index = j + 1;
            }
        }
        System.out.println("The largest element is" + max + "\n" + " Location " + index);


    }
}
