public class IsBeanArray2 {
    // public static int isBean1(int[] a) {
    // for (int i = 0; i < a.length; i++) {
    // if ((a[i] == 9 && a[i] == 13) || (a[i] == 7 && a[i] != 16)) {
    // return 1;
    // }
    // }
    // return 0;
    // }
    public static int isBean1(int[] a) {
        boolean flag9 = false;
        boolean flag13 = false;
        boolean flag7 = false;
        boolean flag16 = false;
        for (int anA : a) {
            if (anA == 9)
                flag9 = true;
            else if (anA == 13)
                flag13 = true;
            else if (anA == 7)
                flag7 = true;
            else if (anA == 16)
                flag16 = true;
        }
        if ((flag9 && flag13) || (flag7 && !flag16) || (!flag9 && !flag7))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBean1(new int[] { 1, 2, 3, 9, 6, 13 }));
        System.out.println(isBean1(new int[] { 3, 4, 6, 7, 13, 15 }));
        System.out.println(isBean1(new int[] { 1, 2, 3, 4, 10, 11, 12 }));
        System.out.println(isBean1(new int[] { 3, 6, 9, 5, 7, 13, 6, 17 }));
        System.out.println(isBean1(new int[] { 9, 6, 18 }));
        System.out.println(isBean1(new int[] { 4, 7, 16 }));
    }
}
