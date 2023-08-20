public class LargestDifferenceEvens {
    public static int largestDifferenceOfEvens(int[] a) {
        int count = 0;
        for (int l = 0; l < a.length; l++) {
            if (a[l] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int diff = 0;
            if (a[i] % 2 == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        diff = a[j] - a[i];
                    }
                }
            }
            if (diff > max) {
                max = diff;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[] { 1, 3, 5, 9 }));
        System.out.println(largestDifferenceOfEvens(new int[] { 2, 2, 2, 2 }));
        System.out.println(largestDifferenceOfEvens(new int[] { 1, 2, 1, 2, 1, 4, 1, 6, 4 }));
    }
}
