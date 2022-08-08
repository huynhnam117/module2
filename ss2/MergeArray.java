package ss2;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int total = arr1.length + arr2.length;
        int[] result = new int[total];
        int number = 0;

        for (int i : arr1) {
            result[number] = i;
            number++;
        }
        for (int j : arr2) {
            result[number] = j;
            number++;
        }
        System.out.println(Arrays.toString(result));
    }
        }

