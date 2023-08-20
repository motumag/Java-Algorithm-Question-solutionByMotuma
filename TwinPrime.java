public class TwinPrime {
    public static int isTwinPrime(int n) {
        if (isPrime(n)) {
            if (isPrime(n + 2) || isPrime(n - 2)) {
                return 1;
            }
        }
        return 0;
    }

    public static int isTwinPrime2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) && (isPrime(a[i] + 2) || isPrime(a[i] - 2))) {
                boolean flag = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == a[i] + 2 && isPrime(a[i] + 2)) {
                        flag = true;
                        break;
                    }
                    if (a[j] == a[i] - 2 && isPrime(a[i] - 2)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static boolean isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // System.out.println(isTwinPrime(5));
        // System.out.println(isTwinPrime(53));
        // System.out.println(isTwinPrime(9));
        // System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime2(new int[] { 3, 5, 8, 10, 27 }));
        System.out.println(isTwinPrime2(new int[] { 11, 9, 12, 13, 23 }));
        System.out.println(isTwinPrime2(new int[] { 5, 3, 14, 7, 18, 67 }));
        System.out.println(isTwinPrime2(new int[] { 13, 14, 15, 3, 5 }));
        System.out.println(isTwinPrime2(new int[] { 1, 17, 8, 25, 67 }));
    }
}
