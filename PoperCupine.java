public class PoperCupine {
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public static int findPorcupineNumber(int n) {
        if (isPrime(n)) {
            if (n % 10 == 9) {
                int nextPrime = n + 1;
                while (true) {
                    nextPrime++;
                    if (isPrime(nextPrime) && nextPrime % 10 == 9) {
                        return nextPrime;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(139)); // Output: true

    }
}
