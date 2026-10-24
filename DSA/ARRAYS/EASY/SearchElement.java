package EASY;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 9 };
        int target = 9;

        if (!findElement(arr, target)) {
            System.out.println(target + " Not Found");
        } else {
            System.out.println(target + " Found");
        }

    }

    public static boolean findElement(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }

        return false;
    }

}
