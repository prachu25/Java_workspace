public class SubProductSum {
    public static void main(String[] args) {
        int ans = subtractProductAndSum(4421);
        System.out.println(ans);
    }

    public static int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }

        int result = product - sum;

        return result;

    }

}
