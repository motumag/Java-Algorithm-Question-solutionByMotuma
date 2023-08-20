public class MaritialArray {
    public static int isMartian(int[] a) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] == a[i + 1]) {
                return 0;
            }
            if (a[i] == 1) {
                count1++;
            }
            if (a[i] == 2) {
                count2++;
            }
        }
        if (count1 > count2) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isMartian(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 }));
        System.out.println(isMartian(new int[] { 1, 3, 2, 2, 1, 5, 1, 5 }));
    }
}
