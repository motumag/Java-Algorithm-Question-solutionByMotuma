public class SystematicallyIncreasing {
    public static int isSystematicallyIncreasing(int[] a) {
        int index = 0;
        for (int i = 0; index < a.length; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (a[index] != j) {
                    return 0;
                }
                index++;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[] { 1, 2, 1, 2, 3 }));
        System.out.println(isSystematicallyIncreasing(new int[] { 1 }));
    }
}
