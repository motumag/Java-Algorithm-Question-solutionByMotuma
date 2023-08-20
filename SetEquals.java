public class SetEquals {
    public static int isSetEqual(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            boolean aFlag = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    aFlag = true;
                }
            }
            if (!aFlag) {
                return 0;
            }
        }

        for (int i = 0; i < b.length; i++) {
            boolean aFlag = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    aFlag = true;
                }
            }
            if (!aFlag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[] { 9, 1, 12, 1 }, new int[] { 1, 9, 12, 9, 12, 1, 9 }));
        System.out.println(isSetEqual(new int[] { 9, 1, 12, 1 }, new int[] { 1, 9, 12, 9, 12, 1, 9, 10 }));
        System.out.println(isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 1 }));
        System.out.println(isSetEqual(new int[] { 1, 7, 8 }, new int[] { 1, 7, 6 }));
    }
}
