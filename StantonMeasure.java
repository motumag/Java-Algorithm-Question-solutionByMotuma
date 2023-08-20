public class StantonMeasure {
    public static int stantonMeasure(int[] a) {
        int countOnes = 0;
        int stantonCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countOnes++;
            }
        }
        if (countOnes == 0) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == countOnes) {
                stantonCount++;
            }
        }
        return stantonCount;
    }

    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[] { 1, 4, 3, 2, 1, 2, 3, 2 }));
        System.out.println(stantonMeasure(new int[] { 3, 1, 1, 4 }));
        System.out.println(stantonMeasure(new int[] { 1 }));
        System.out.println(stantonMeasure(new int[] { 0 }));
    }
}
