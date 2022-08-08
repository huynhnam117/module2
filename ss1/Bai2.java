package ss1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tiền USD: ");
        USD = scanner.nextDouble();
        double quydoi = USD * 23000;
        System.out.println("Giá trị là:  " + quydoi);
    }
}
