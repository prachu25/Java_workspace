package EASY;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1, 3 };
        int[] arr2 = { 2, 2, 3 };

        int[] ans = intersection(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] intersection(int[] arr1, int[] arr2) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    res.add(arr1[i]);
                    break; // its break only inner loop
                }
            }
        }

        int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }

}
