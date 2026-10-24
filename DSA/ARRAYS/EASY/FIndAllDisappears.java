package EASY;

import java.util.ArrayList;
import java.util.Arrays;

public class FIndAllDisappears {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] ans = findDisappears(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findDisappears(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int i = 1; i <= n; i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                res.add(i); // adding the dissappears number which not present in array
            }
        }

        int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }

}
