package EASY;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 4, 2, 2 };
        int ans = findMajorityEle(arr);
        System.out.println("Majority Element = " + ans);

    }

    public static int findMajorityEle(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }

            if (cnt > n / 2) {
                return arr[i];
            }
        }

        return -1;
    }

}
