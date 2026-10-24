package EASY;

import java.util.Arrays;

public class SortZerosOncesTwo {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 0, 1, 0 };

        sorts(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sorts(int[] arr) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }

        // fill zeros
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }

        // fill ones
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            arr[i] = 1;
        }

        // fill twos
        for (int i = cnt0 + cnt1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }

}
