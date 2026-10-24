package EASY;

public class PrintArrElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        printElement(arr);
    }

    public static void printElement(int[] arr) {

        for (int i : arr) {
            System.out.println(i);
        }
    }

}
