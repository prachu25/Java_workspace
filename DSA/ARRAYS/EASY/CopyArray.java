package EASY;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 99 };

        int[] ans = copy(arr);
        System.out.println("copy Array = " + Arrays.toString(ans));

    }

    public static int[] copy(int[] arr) {

        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        return copy;
    }

}
