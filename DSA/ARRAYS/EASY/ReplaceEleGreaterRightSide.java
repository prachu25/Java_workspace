import java.util.Arrays;

public class ReplaceEleGreaterRightSide {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        int[] ans = findGreatestOnRightSide(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] findGreatestOnRightSide(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int max = -1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            ans[i] = max;
        }

        return ans;
    }

}
