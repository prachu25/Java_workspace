package EASY;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 3, 4 };
        int ans = findSingleNum(arr);

        System.out.println("Single Number: " + ans);

    }

    public static int findSingleNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                return arr[i]; // print single element
            }
        }

        return -1; // Not Found
    }

}
