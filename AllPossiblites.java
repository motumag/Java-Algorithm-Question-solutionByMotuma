public class AllPossiblites {
    public static int isAllPossibilities(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }
        for (int j = 0; j < max; j++) {
            boolean occurFlag = false;
            for (int k = 0; k < a.length; k++) {
                if (j == a[k]) {
                    occurFlag = true;
                    break;
                }
            }
            if (!occurFlag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] { 1, 2, 0, 3 }));
        System.out.println(isAllPossibilities(new int[] { 1, 2, 4, 3 }));
    }
}
