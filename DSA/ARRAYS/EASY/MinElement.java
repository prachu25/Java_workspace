package EASY;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = { 13, 45, 8, 34, 2 };
        int ans = findMin(arr);
        System.out.println("Minimum Element: " + ans);
    }

    public static int findMin(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

}
