/*
 * LeetCode 1480: Running Sum of 1d Array
 *
 * Problem: Return an array where each element is the sum
 * of all elements from index 0 to the current index.
 *
 * Example:
 * Input:  [1, 2, 3, 4]
 * Output: [1, 3, 6, 10]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Running_SumArr {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 10, 1 };
        int[] ans = sumArr(arr);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] sumArr(int[] arr) {

        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            res.add(sum);
        }

        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }

}
