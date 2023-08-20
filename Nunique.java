public class Nunique {
    public static int isNUnique(int[] a, int n) {
        if (a.length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
            }
        }
        if (count == 1) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isNUnique(new int[] { 7, 3, 3, 2, 4 }, 6));
        System.out.println(isNUnique(new int[] { 7, 3, 3, 2, 4 }, 11));
    }
}
