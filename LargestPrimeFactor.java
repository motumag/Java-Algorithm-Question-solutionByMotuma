public class LargestPrimeFactor {
    static int largestPrimeFactor(int n) {
        if (n <= 1)
            return 0;

        int largestPrimeFactor = 2;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }
        }
        return largestPrimeFactor;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
        System.out.println(largestPrimeFactor(11));
    }

}
