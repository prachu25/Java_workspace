package EASY;

public class CheckSortedOrNot {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4 };

        if (!isSorted(arr)) {
            System.out.println("Not Sorted");
        } else {
            System.out.println("Array is sorted");
        }

    }

    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }

        }

        return true;
    }

}
