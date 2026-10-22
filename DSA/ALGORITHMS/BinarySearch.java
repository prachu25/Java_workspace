public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38 };
        int target = 16;

        System.out.println("Target Element Found At Index: " + searchByBinary(arr, target));
    }

    public static int searchByBinary(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }

}
