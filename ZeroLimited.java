public class ZeroLimited {
    static int isZeroLimited(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 3 * ((i - 1) / 3) + 1) {
                if (a[i] != 0) {
                    return 0;
                }
            } else {
                if (a[i] == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isZeroLimited(new int[] { 0, 0, 0, 0, 0 }));
        System.out.println(isZeroLimited(new int[] { 1, 0 }));
        System.out.println(isZeroLimited(new int[] { 0, 1 }));
        System.out.println(isZeroLimited(new int[] { 5 }));
        System.out.println(isZeroLimited(new int[] { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0 }));
        System.out.println(isZeroLimited(new int[] {}));
    }
}
