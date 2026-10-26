package EASY;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        int[] ans = sortArrByParity(arr);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] sortArrByParity(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        return arr;

    }
}
