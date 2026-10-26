package EASY;

public class ValidMountain {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 5 };
        boolean ans = vaildMountainOrNot(arr);
        System.out.println("Answer: " + ans);

    }

    public static boolean vaildMountainOrNot(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        int i = 0;

        // check increasing order
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // peak cannot be first or last
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // check decreasing order
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;

    }

}
