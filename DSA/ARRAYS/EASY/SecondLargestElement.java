package EASY;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 8, 45, 9, 99 };
        int ans = secondMax(arr);

        System.out.println("Second Max Element: " + ans);

    }

    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }

        return second_max;
    }

}
