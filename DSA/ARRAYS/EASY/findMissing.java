package EASY;

public class findMissing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };

        System.out.println("Missing Number: " + findMissingNum(arr));
    }

    public static int findMissingNum(int[] arr) {

        int n = arr.length + 1; // 4 + 1 = 5 { 1, 2, 4, 5 } => total 4 ele + 1 = 5
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;

        return missing;
    }

    // 2. Using XOR
    public static int findByXOR(int[] arr) {
        int n = arr.length + 1;

        int XOR1 = 0;
        int XOR2 = 0;

        for (int i = 1; i <= n; i++) {
            XOR1 = XOR1 ^ i;
        }

        for (int i = 0; i < arr.length; i++) {
            XOR2 = XOR2 ^ arr[i];
        }

        int missing = XOR1 ^ XOR2;

        return missing;
    }

}
