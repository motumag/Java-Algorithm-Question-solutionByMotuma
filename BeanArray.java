public class BeanArray {
    public static int isBean(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int x = 0; x < a.length; x++) {
                if (a[i] == a[x] + 1 || a[i] == a[x] - 1) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static int isBean2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if ((a[j] == a[i] + 1) || (a[j] == a[i] - 1)) {
                    // if ((a[i] == a[j] + 1) || (a[i] == a[j] - 1)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static int isBean3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if ((a[j] == 2 * a[i]) || (a[j] == 2 * a[i] + 1) || (a[j] == a[i] / 2)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] bean1 = { 2, 10, 9, 3 };
        int[] bean2 = { 2, 2, 3, 3, 3 };
        int[] bean3 = { 1, 1, 1, 2, 1, 1 };
        int[] bean4 = { 3, 4, 5, 7 };
        // System.out.println(isBean(bean1));
        // System.out.println(isBean(bean2));
        // System.out.println(isBean(bean3));
        // System.out.println(isBean(bean4));

        System.out.println(isBean2(bean1));
        System.out.println(isBean2(bean2));
        System.out.println(isBean2(bean3));
        System.out.println(isBean2(bean4));

        // System.out.println(isBean3(new int[] { 4, 9, 8 }));
        // System.out.println(isBean3(new int[] { 2, 2, 5, 11, 23 }));
        // System.out.println(isBean3(new int[] { 7, 7, 3, 6 }));
        // System.out.println(isBean3(new int[] { 0 }));
        // System.out.println(isBean3(new int[] { 3, 8, 4 }));

    }
}
