public class FineArray {
    public static int isFineArray(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                counter++;
                for (int j = 0; j < a.length; j++) {
                    for (int k = i + 1; k < a.length; k++) {
                        if (a[i] + 2 == a[k] || a[i] - 2 == a[k]) {
                            return 1;
                        }
                    }
                }
            }
            if (counter == 0) {
                return 1;
            }

        }
        return 0;
    }

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

    public static void main(String[] args) {
        System.out.println(isFineArray(new int[] { 4, 7, 9, 6, 5 }));
        System.out.println(isFineArray(new int[] { 4, 9, 6, 33 }));
        System.out.println(isFineArray(new int[] { 3, 8, 15 }));
        System.out.println(isFineArray(new int[] { 53, 8, 15 }));
    }
}
