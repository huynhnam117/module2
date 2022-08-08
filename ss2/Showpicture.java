package ss2;

import java.util.Scanner;

public class Showpicture {
    public static void main(String[] args) {
        //  Hình Tam Giác
        int main;
            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.printf("*");

                }
                System.out.printf("\n");
            }

            System.out.println();

    //   Hình Tam Giác Ngược
        for (int i = 7; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("*");

            }
            System.out.printf("\n");

        }

        System.out.println();

//    Hình Chữ Nhật
        for ( int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("*");

            }
            System.out.printf("\n");
        }


    }
}
