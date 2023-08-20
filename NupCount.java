public class NupCount {
    public static int nUpcount(int[] a, int n) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sum += a[i];
            if (sum <= n && a[i] <= n && sum + a[i + 1] > n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(nUpcount(new int[] { 2, 3, 1, -6, 8, -3, -1, 2 }, 5));
        System.out.println(nUpcount(new int[] { 6, 3, 1 }, 6));
    }
}
