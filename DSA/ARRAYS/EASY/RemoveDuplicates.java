package EASY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 2, 4, 5, 5 };
        int[] ans = removeDup(arr);

        System.out.println(Arrays.toString(ans));

    }

    // 1. Creating Array Extra
    public static int[] removeDup(int[] arr) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!res.contains(arr[i])) {
                res.add(arr[i]);
            }
        }

        int[] ans = new int[res.size()];

        for (int x = 0; x < res.size(); x++) {
            ans[x] = res.get(x);
        }

        return ans;
    }

    // 2. USING SET
    public static int[] removeBySet(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] ans = new int[set.size()];
        int i = 0;

        for (int num : set) {
            ans[i] = num;
            i++;
        }

        return ans;
    }

    // 3. Without Built in function
    public static int[] removeDuplicates(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return Arrays.copyOf(arr, i + 1);

    }

}
