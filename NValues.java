public class NValues {
    static boolean hasNValues(int[] a, int n) {
        if (a.length < n) {

            return false;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    break;
                }
                count++;
            }
        }
        if (count == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasNValues(new int[] { 1, 2, 2, 1 }, 2));
        System.out.println(hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 3));
        System.out.println(hasNValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 10));
        System.out.println(hasNValues(new int[] { 1, 2, 2, 1 }, 3));
        System.out.println(hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 2));
        System.out.println(hasNValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 20));
    }
}
