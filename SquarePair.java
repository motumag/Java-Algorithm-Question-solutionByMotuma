public class SquarePair {
    static int countSquarePair(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0) {
                    if (isPerfectSquare(a[i] + a[j])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static boolean isPerfectSquare(int num) {
        // double sqrt = Math.sqrt(num);
        // return sqrt == (int) sqrt;
        // or if we are not allowed to use Math.sqrt
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(countSquarePair(new int[] { 9, 0, 2, -5, 7 }));
        System.out.println(countSquarePair(new int[] { 9 }));
    }
}
