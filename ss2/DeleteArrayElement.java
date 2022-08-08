package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int arr = scanner.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == arr){
                for (int j = i; j < number.length-1; j++) {
                    if(number[j] == number[j + 1]){

                    }

                }
                    number[number.length-1] = 0;
                    break;
                }
            }
        System.out.println(Arrays.toString(number));
    }
}
