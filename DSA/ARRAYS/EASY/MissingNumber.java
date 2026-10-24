package EASY;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int ans = findMissingNumber(arr);
        System.out.println("Missing  Number: " + ans);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int xorr = 0;

        // Traverse through the index base
        for (int i = 0; i <= n; i++) {
            xorr = xorr ^ i;
        }

        // Traverse Through the Element base
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }

        return xorr;
    }

}
