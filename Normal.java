public class Normal {
    public static int isNormal(int n) {
        for (int i = 2; i < n; i++) {
            if (i % 2 != 0) {
                if (n % i == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int isNormal2(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i) == 1) {
                return 0;
            }
        }
        return 1;
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
        // System.out.println(isNormal(1));
        // System.out.println(isNormal(2));
        // System.out.println(isNormal(3));
        // System.out.println(isNormal(4));
        // System.out.println(isNormal(5));
        // System.out.println(isNormal(6));
        // System.out.println(isNormal(7));
        // System.out.println(isNormal(8));
        // System.out.println(isNormal(9));
        // System.out.println(isNormal(10));

        System.out.println(isNormal2(10));
        System.out.println(isNormal2(8));
        System.out.println(isNormal2(9));
    }
}
