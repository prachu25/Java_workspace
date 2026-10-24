package EASY;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = reverseArray(arr);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] reverseArray(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        return arr;
    }

}
