public class IsHollow {
    public static int isHollow(int[] a) {
        int left = 0;
        int right = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                right++;
            } else {
                break;
            }
        }
        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] != 0) {
                left++;
            } else {
                break;
            }
        }
        for (int k = right; k < a.length; k++) {
            if (a[k] == 0) {
                count++;
            } else {
                break;
            }
        }
        if (right != left || count < 3) {
            return 0;
        }
        return 1;
    }

    static int isHollow1(int[] a) {
        if (a.length < 3)
            return 0;
        int zeroCount = 0;
        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            if ((a[i] == 0 && a[j] != 0) || (a[i] != 0 && a[j] == 0)) {
                return 0;
            }
            if (i == j && a[i] == 0) {
                zeroCount++;
            } else {
                if (a[i] == 0)
                    zeroCount++;

                if (a[j] == 0)
                    zeroCount++;
            }
        }

        if (zeroCount >= 3)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4 }));
        System.out.println(isHollow(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2,
                18 }));
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 3, 4 }));
        System.out.println(isHollow(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 }));
        System.out.println(isHollow(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 }));
        System.out.println(isHollow(new int[] { 0, 0, 0 }));
        System.out.println();
        System.out.println(isHollow1(new int[] { 1, 2, 0, 0, 0, 3, 4 }));
        System.out.println(isHollow1(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2,
                18 }));
        System.out.println(isHollow1(new int[] { 1, 2, 0, 0, 3, 4 }));
        System.out.println(isHollow1(new int[] { 1, 2, 0, 0, 0, 3, 4, 0 }));
        System.out.println(isHollow1(new int[] { 0, 1, 2, 0, 0, 0, 3, 4 }));
        System.out.println(isHollow1(new int[] { 0, 0, 0 }));
    }
}
