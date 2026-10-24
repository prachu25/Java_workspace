package EASY;

import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 9, 3, 0, 4 };
        int[] ans = movesZeroEnd(arr);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] movesZeroEnd(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaning element with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        return arr;

    }

}
