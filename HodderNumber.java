public class HodderNumber {
    public static int isHodder(int n) {
        int num = n + 1;
        int originalN = n;
        int count = 0;
        if (isPrime(n) == 1) {
            while (originalN > 0) {
                int digit = originalN % 2;
                count++;
                originalN = originalN / 2;
            }
        }
        int check = (int) Math.pow(2, count);
        // if (num == check) {
        // return 1;
        // }
        if (n == check - 1) {
            return 1;
        }
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
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));
    }

}
