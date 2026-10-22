import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 45, 33, 22, 99, 2, 6 };
        int[] ans = sortBySelection(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] sortBySelection(int[] arr) {

        int min;

        for (int i = 0; i < arr.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap arr[i] & min
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        return arr;
    }

}
