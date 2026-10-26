package EASY;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMissmatch {

    public int[] findErrorNums(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        // Find Duplicates
        for (int i : arr) {
            if (set.contains(i)) {
                res.add(i); // adding duplicate elements
                break;
            } else {
                set.add(i);
            }
        }

        // Findi Missing
        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                res.add(i);
                break;
            }
        }

        int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }

}
// Time complexity - o(N)
// Space complexity - o(N) bcz, using extra space strore unique element.