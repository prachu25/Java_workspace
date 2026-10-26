public class ThirdMaximum {

    public int thirdMax(int[] arr) {

        long first_max = Long.MIN_VALUE;
        long second_max = Long.MIN_VALUE;
        long third_max = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            // Skip the duplicate
            if (num == first_max || num == second_max || num == third_max) {
                continue;
            }

            // First Maximum
            if (num > first_max) {
                third_max = second_max;
                second_max = first_max;
                first_max = num;
            }

            // second maximum
            else if (num > second_max) {
                third_max = second_max;
                second_max = num;
            }

            // third maximum
            else if (num > third_max) {
                third_max = num;
            }
        }

        // In Case third maximum not found return First Maximum.
        if (third_max == Long.MIN_VALUE) {
            return (int) first_max;
        }

        return (int) third_max; // if third Maximum found return
    }

}
