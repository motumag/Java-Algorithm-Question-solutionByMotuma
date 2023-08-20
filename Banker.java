public class Banker {
    static int isBunker(int n) {
        int previousElement = 1;
        int index = 0;
        int element = 0;

        while (element < n) {
            element = previousElement + index;
            previousElement = element;
            index++;
        }
        if (element == n)
            return 1;
        return 0;
    }

    public static int isBunker2(int n) {
        int sum = 1;
        for (int i = 1; sum <= n; i++) {
            sum += i;
            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }

    public static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                if (a[i + 1] % 2 != 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int isBanker(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 1) {
                        return 1;
                    }
                }
            } else {
                return 0;
            }
        }
        return 0;
    }

    public static int isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // System.out.println(isBunker(11));
        // System.out.println(isBunker(22));
        // System.out.println(isBunker(8));

        // System.out.println(isBunker2(22));
        // System.out.println(isBunker2(8));

        System.out.println("IsBanker Array");
        System.out.println(isBunkerArray(new int[] { 4, 9, 6, 7, 3 }));
        System.out.println(isBunkerArray(new int[] { 4, 9, 6, 15, 21 }));
        System.out.println();
        System.out.println(isBanker(new int[] { 7, 6, 10, 1 }));
        System.out.println(isBanker(new int[] { 7, 6, 10 }));
        System.out.println(isBanker(new int[] { 6, 10, 1 }));
        System.out.println(isBanker(new int[] { 3, 7, 1, 8, 1 }));
    }
}
