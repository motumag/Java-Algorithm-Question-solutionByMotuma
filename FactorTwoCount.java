public class FactorTwoCount {
    public static int factorTwoCount(int n) {
        int counter = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                break;
            }
            int x = n % 2;
            counter++;
            n = n / 2;
        }
        return counter;
    }

    public static int factorEqual(int n, int m) {
        int countN = 0;
        int countM = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                countN++;
            }
        }
        for (int j = 1; j <= m; j++) {
            if (m % j == 0) {
                countM++;
            }
        }
        if (countN == countM) {
            return 1;
        }
        return 0;
    }

    static int factorTwoCount2(int n) {
        int count = 0;

        while (n % 2 == 0) {
            // if (n % 2 == 0) {
            count++;
            n /= 2;
            // }
        }

        return count;
    }

    public static void main(String[] args) {
        // System.out.println(factorTwoCount(48));
        // System.out.println(factorTwoCount(27));

        System.out.println(factorTwoCount2(48));
        System.out.println(factorTwoCount2(27));
        System.out.println(factorEqual(10, 33));
        System.out.println(factorEqual(9, 10));
    }
}
