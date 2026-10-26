package EASY;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = { 3, 7 };
        int ans = findMaxProduct(arr);
        System.out.println("Answer of Product: " + ans);
    }

    public static int findMaxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max) {
                second_max = arr[i];
            }
        }

        int product = (max - 1) * (second_max - 1);

        return product;
    }

}
