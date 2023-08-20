public class BalancedArray {
    // By Motuma Gishu
    public static int isBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sign = -1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < 0) {
                    a[i] = sign * a[i];
                }
                if (a[i] == a[j]) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int isBalanced2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((i % 2 == 0 && a[i] % 2 != 0) || (i % 2 != 0 && a[i] % 2 == 0)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[] { -2, 3, 2, -3 }));
        System.out.println(isBalanced(new int[] { -2, 2, 2, 2 }));
        System.out.println(isBalanced(new int[] { -5, 2, -2 }));
        System.out.println("isBalanced2");
        System.out.println(isBalanced2(new int[] { 2, 3, 6, 7 }));
        System.out.println(isBalanced2(new int[] { 6, 7, 2, 3, 12 }));
        System.out.println(isBalanced2(new int[] { 7, 15, 2, 3 }));
    }
}
