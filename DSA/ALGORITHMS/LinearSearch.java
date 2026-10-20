public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 1, 44, 66, 7, -9 };
        boolean ans = LinearSearchAlgo(arr, 44);
        System.out.println(ans);
    }

    public static boolean LinearSearchAlgo(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }

        return false;

    }
}
