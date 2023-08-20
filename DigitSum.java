public class DigitSum {
    public static int isDigitSum(int n, int m) {
        if (n < 0 || m < 0) {
            return -1;
        }
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        if (sum < m) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isDigitSum(32121, 10));
        System.out.println(isDigitSum(32121, 9));
        System.out.println(isDigitSum(-543, 3));
    }
}
