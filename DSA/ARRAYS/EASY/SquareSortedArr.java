package EASY;

import java.util.Arrays;

public class SquareSortedArr {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        int[] ans = square(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] square(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }
}
