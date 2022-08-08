package ss2;

import java.util.Scanner;

public class ShowSmallPrimeNumber100 {
    public static void main(String[] args) {
        System.out.println("Hiển thị 100 số nguyên tố ");


        for (int i = 2; i < 100 ; i++) {
            int count = 0;
            for (int j = 2; j <= i ; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(i + "");

            }
        }
        }
    }




