package EASY;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallerNumberThanCurrent {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 4, 1 };

        int[] ans = smallerThanCurrent(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] smallerThanCurrent(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }

            list.add(cnt);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

}
