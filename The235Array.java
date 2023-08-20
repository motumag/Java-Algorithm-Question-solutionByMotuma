public class The235Array {
    public static int is235Array(int[] a) {
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int countNondev = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count2++;
            }
            if (a[i] % 3 == 0) {
                count3++;
            }
            if (a[i] % 5 == 0) {
                count5++;
            }
            if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
                countNondev++;
            }
        }
        int tot = count2 + count3 + count5 + countNondev;
        if (tot == a.length) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(is235Array(new int[] { 2, 3, 5, 7, 11 }));
        System.out.println(is235Array(new int[] { 2, 3, 6, 7, 11 }));
        System.out.println(is235Array(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        System.out.println(is235Array(new int[] { 2, 4, 8, 16, 32 }));
        System.out.println(is235Array(new int[] { 3, 9, 27, 7, 1, 1, 1, 1, 1 }));
    }
}
