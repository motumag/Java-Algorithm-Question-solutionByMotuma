public class Inertial {
    public static int isInertial(int[] a) {
        int countOdd = 0;
        int maxEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                countOdd++;
                break;
            }
        }
        int index = 0;
        if (countOdd >= 1) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > maxEven && a[i] % 2 == 0) {
                    maxEven = a[i];
                    index = i;
                }
            }
        }
        if (maxEven % 2 == 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    for (int j = 0; j < a.length; j++) {
                        if (a[j] % 2 == 0) {
                            if (a[i] < a[index] && a[i] > a[j]) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isInertial(new int[] { 1 }));
        System.out.println(isInertial(new int[] { 2 }));
        System.out.println(isInertial(new int[] { 1, 2, 3, 4 }));
        System.out.println(isInertial(new int[] { 1, 1, 1, 1, 1, 1, 2 }));
        System.out.println(isInertial(new int[] { 2, 12, 4, 6, 8, 11 }));
        System.out.println(isInertial(new int[] { 2, 12, 12, 4, 6, 8, 11 }));
        System.out.println(isInertial(new int[] { -2, -4, -6, -8, -11 }));
        System.out.println(isInertial(new int[] { 2, 3, 5, 7 }));
        System.out.println(isInertial(new int[] { 2, 4, 6, 8, 10 }));
    }
}
