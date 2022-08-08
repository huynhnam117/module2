package ss3;

import java.util.Scanner;

public class CountNumberOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input here: ");
        int count = 0;
        char input = scanner.nextLine().charAt(0);
        String str1 = "hello world";

        for (int i = 0; i < str1.length(); i++) {
            if (input == str1.charAt(i)) {
                count++;
            }
        }
        System.out.println("Numbers appear are: " + count);



    }




}
