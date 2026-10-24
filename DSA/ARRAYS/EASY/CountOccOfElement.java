package EASY;

public class CountOccOfElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 3, 2 };
        int target = 24;
        int ans = countOccurenece(arr, target);
        System.out.println("Elemenet Appears " + ans + " times");
    }

    public static int countOccurenece(int[] arr, int target) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                cnt++;
            }
        }
        return cnt;
    }

}
