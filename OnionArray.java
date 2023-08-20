public class OnionArray {
    public static int isOnionArray(int[] a) {
        if (a.length == 1 || a.length == 0)
            return 1;

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            if (i + j == a.length) {
                if (a[i] + a[j] > 10)
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[] { 1, 2, 19, 4, 5 }));
    }
}
