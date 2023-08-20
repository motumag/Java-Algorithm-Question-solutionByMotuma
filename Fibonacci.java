public class Fibonacci {
    public static int isFibonacci(int x) {
        if (isPerfectSquare(5 * x * x + 4) || isPerfectSquare(5 * x * x - 4)) {
            return 1;
        }
        return 0;
    }

    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        System.out.println("num: " + s);
        return (s * s == x);
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(8));

    }
}
