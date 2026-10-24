package EASY;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        int ans = sumofArr(arr);
        System.out.println("SUM = " + ans);

    }

    public static int sumofArr(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

}
