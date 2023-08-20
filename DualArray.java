public class DualArray {
    public static int isDual(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int counter = 1;
            for (int j = 0; j < a.length; j++) {
                if ((i != j) && a[i] == a[j]) {
                    counter++;
                }
            }
            if (counter != 2) {
                return 0;
            }
        }
        return 1;
    }

    public static int isDual2(int[] a) {
        for (int a1 : a) {
            int counter = 0;
            for (int a2 : a) {
                if (a1 == a2) {
                    counter++;
                }
            }
            if (counter != 2) {
                return 0;
            }
        }
        return 1;
    }

    public static int isDual3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;
                }
            }
            if (counter != 2) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = { 1, 2, 1, 3, 3, 2 };
        int[] test2 = { 2, 5, 2, 5, 5 };
        // System.out.println(isDual(test1));
        // System.out.println(isDual(test2));

        System.out.println(isDual2(new int[] { 1, 2, 1, 3, 3, 2 }));
        System.out.println(isDual2(new int[] { 2, 5, 2, 5, 5 }));
        System.out.println(isDual2(new int[] { 3, 1, 1, 2, 2 }));

        System.out.println(isDual3(new int[] { 1, 2, 1, 3, 3, 2 }));
        System.out.println(isDual3(new int[] { 2, 5, 2, 5, 5 }));
        System.out.println(isDual3(new int[] { 3, 1, 1, 2, 2 }));

    }
}
