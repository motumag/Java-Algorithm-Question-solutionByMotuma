public class FilterArray {
    public static int isFilter(int[] a) {
        boolean flag9 = false;
        boolean flag11 = false;
        boolean flag7 = false;
        boolean flag13 = false;
        for (int x : a) {
            if (x == 9) {
                flag9 = true;
            } else if (x == 11) {
                flag11 = true;
            } else if (x == 7) {
                flag7 = true;
            } else if (x == 13) {
                flag13 = true;
            }
        }

        if ((flag9 && flag11) || (flag7 && !flag13) || (!flag9 && !flag7)) {
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(isFilter(new int[] { 1, 2, 3, 9, 6, 11 }));
        System.out.println(isFilter(new int[] { 3, 4, 6, 7, 14, 16 }));
        System.out.println(isFilter(new int[] { 1, 2, 3, 4, 10, 11, 13 }));
        System.out.println(isFilter(new int[] { 9, 6, 18 }));
        System.out.println(isFilter(new int[] { 4, 7, 13 }));
    }
}
