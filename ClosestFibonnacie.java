public class ClosestFibonnacie {
    public static int closestFibonacci(int n) {
        int fibonacci = 1;
        if (n == 1 || n == 2) {
            fibonacci = 1;
        }
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = fibo1 + fibo2;
            if (fibonacci > n)
                return fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }

        return 0;
    }

    public static int closestFibonacci2(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        int fibonacci = 0;
        int fb1 = 1;
        int fb2 = 1;
        while (fibonacci < n) {
            fibonacci = fb1 + fb2;
            fb1 = fb2;
            fb2 = fibonacci;
        }
        return fb1;
    }

    public static void main(String[] args) {
        // System.out.println(closestFibonacci(13));
        // System.out.println(closestFibonacci(12));
        // System.out.println(closestFibonacci(33));
        // System.out.println(closestFibonacci(34));
        System.out.println(closestFibonacci2(13));
        System.out.println(closestFibonacci2(12));
        System.out.println(closestFibonacci2(34));
    }
}
