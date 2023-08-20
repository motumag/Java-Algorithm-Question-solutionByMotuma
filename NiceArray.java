public class NiceArray {
    public static int isNice(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i] - 1 || a[j] == a[i] + 1) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }
        }
        return 1;
    }

    public static int isNice1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] - 1 || arr[j] == arr[i] + 1) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return 0;
            }
        }

        return 1;
    }

    public static int isNiceArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                sum += a[i];
            }
        }
        if (a[0] == sum) {
            return 1;

        }
        return 0;
    }

    public static int isNiceArray2(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                if (i == 0) {
                    sum = a[i];
                }
                if (i != 0) {
                    sum += a[i];
                }
            }
        }
        if ((a[0] == sum) || sum == 0 && a[0] == 0) {
            return 1;

        }
        return 0;
    }

    // github
    static int isNice2(int[] a) {
        int primeSum = 0;

        for (int anA : a) {
            if (isPrime(anA) == 1)
                primeSum += anA;
        }
        if (a[0] == primeSum)
            return 1;
        return 0;
    }

    public static int isPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // System.out.println(isNice1(new int[] { 2, 10, 9, 3 }));
        // System.out.println(isNice1(new int[] { 2, 2, 3, 3, 3 }));
        // System.out.println(isNice1(new int[] { 1, 1, 1, 2, 1, 1 }));
        // System.out.println(isNice1(new int[] { 0, -1, 1 }));
        // System.out.println(isNice1(new int[] { 3, 4, 5, 7 }));

        System.out.println(isNiceArray(new int[] { 21, 3, 7, 9, 11, 4, 6 }));
        System.out.println(isNiceArray(new int[] { 13, 4, 4, 4, 4 }));
        System.out.println(isNiceArray(new int[] { 10, 5, 5 }));
        System.out.println(isNiceArray(new int[] { 0, 6, 8, 20 }));
        System.out.println(isNiceArray(new int[] { 8, 5, -5, 5, 3 }));
        System.out.println(isNiceArray(new int[] { 3 }));

        // System.out.println(isNice2(new int[] { 21, 3, 7, 9, 11, 4, 6 }));
        // System.out.println(isNice2(new int[] { 13, 4, 4, 4, 4 }));
        // System.out.println(isNice2(new int[] { 10, 5, 5 }));
        // System.out.println(isNice2(new int[] { 0, 6, 8, 20 }));
        // System.out.println(isNice2(new int[] { 8, 5, -5, 5, 3 }));
        // System.out.println(isNice2(new int[] { 3 }));
    }
}
