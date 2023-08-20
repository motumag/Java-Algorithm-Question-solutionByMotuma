public class PrimeHappy {
    public static int isPrimeHappy(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        if (sum % n == 0) {
            return 1;
        }
        return 0;
    }

    public static boolean isPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
    }
}
