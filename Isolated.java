public class Isolated {
    static int isIsolated(long n) {
        if (n >= 2097151 || n < 1) {
            return -1;
        }
        long sqrt = n * n;
        long cube = n * n * n;
        while (cube > 0) {
            long dcube = cube % 10;
            cube = cube / 10;
            long tempSqrt = sqrt;
            while (tempSqrt > 0) {
                long dsqrt = tempSqrt % 10;
                tempSqrt = tempSqrt / 10;
                if (dcube == dsqrt) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isIsolated(69));
        System.out.println(isIsolated(163));
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
        System.out.println(isIsolated(14));
        System.out.println(isIsolated(24));
        System.out.println(isIsolated(28));
        System.out.println(isIsolated(34));
        System.out.println(isIsolated(58));
        System.out.println(isIsolated(63));
    }
}
