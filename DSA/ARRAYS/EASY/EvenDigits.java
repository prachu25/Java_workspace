public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 349, 2, 6, 2345 };
        int ans = findEvenDigit(arr);
        System.out.println("Answer: " + ans);
    }

    public static int findEvenDigit(int[] arr) {
        int cnt_even = 0;

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i];
            int cnt = 0;

            while (digit > 0) {
                cnt++;
                digit = digit / 10;
            }

            if (cnt % 2 == 0) {
                cnt_even++;
            }
        }

        return cnt_even;
    }

}
