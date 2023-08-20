public class PrimeCount {
    public static int primeCount(int start, int end) {
        int countPrimes = 0;
        if (end < start || (start == end && start == 1)) {
            return countPrimes;
        }
        if (start < 0)
            start = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                countPrimes++;
            }
        }
        return countPrimes;
    }

    public static boolean isPrime(int a) {
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(-10, 6));

    }
}
