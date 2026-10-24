package EASY;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 0, 1, 1, 0 };
        int ans = maxOnes(arr);

        System.out.println("MaxConsecutive Ones: " + ans);

    }

    public static int maxOnes(int[] arr) {
        int maxi = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            // pick the maximum number
            maxi = Math.max(maxi, cnt);
        }

        return maxi;
    }

}
