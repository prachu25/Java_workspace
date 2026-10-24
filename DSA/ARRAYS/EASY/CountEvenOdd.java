package EASY;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        count(arr);
    }

    public static void count(int[] arr) {
        int e_cnt = 0;
        int o_cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                e_cnt++;
            } else {
                o_cnt++;
            }
        }

        System.out.println("Even count = " + e_cnt);
        System.out.println("odd count = " + o_cnt);
    }
}
