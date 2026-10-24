package EASY;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = { 13, 45, 8, 34, 2 };
        int ans = findMax(arr);
        System.out.println("Maximum Element: " + ans);
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
