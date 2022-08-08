package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số muôn thêm: ");
        int numberAdd = scanner.nextInt();
        System.out.print("Vị trí muốn thêm: ");
        int Add = scanner.nextInt();

        for (int i = number.length -1 ; i > Add ; i--) {
            number[i]=number[i-1];
        }
        number[Add]=numberAdd;
        System.out.println(Arrays.toString(number));

    }
}
