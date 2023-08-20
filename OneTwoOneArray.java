public class OneTwoOneArray {
    // public static int is121Array(int[] a) {
    // if (a[0] != 1 || a[a.length - 1] != 1) {
    // return 0;
    // }
    // int countOnesRight = 0;
    // int countOnesLeft = 0;
    // for (int i = 0; i < a.length; i++) {
    // if (a[i] == 1) {
    // countOnesRight++;
    // } else {
    // break;
    // }
    // }
    // for (int j = a.length - 1; j >= 0; j--) {
    // if (a[j] == 1) {
    // countOnesLeft++;
    // } else {
    // break;
    // }
    // }
    // if (countOnesRight != countOnesLeft) {
    // return 0;
    // }
    // for (int k = countOnesRight; k <= a.length-1; k++) {
    // if (a[k] == 2) {
    // return 1;
    // }
    // }
    // return 0;
    // }
    public static int is121Array(int[] a) {
        if (a.length < 3 || a[0] != 1 || a[a.length - 1] != 1) {
            return 0;
        }
        int countOnesFromRight = 0;
        int countOnesFromLeft = 0;
        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            if (a[i] == 1) {
                countOnesFromRight++;
                i++;
            } else if (a[j] == 1) {
                countOnesFromLeft++;
                j--;
            } else {
                break;
            }
        }

        if (countOnesFromRight != countOnesFromLeft) {
            return 0;
        }

        for (int k = countOnesFromRight; k <= j; k++) {
            if (a[k] != 2) {
                return 0;
            }
        }

        return 1;
    }

    public static int is121ArrayOne(int[] a) {
        int onesCount = 0;
        int twosCount = 0;
        int i = 0;
        while (i < a.length && a[i] == 1) {
            onesCount++;
            i++;
        }
        while (i < a.length && a[i] == 2) {
            twosCount++;
            i++;
        }
        while (i < a.length && a[i] == 1) {
            onesCount--;
            i++;
        }
        if (i == a.length && onesCount == 0 && twosCount > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(is121Array(new int[] { 1, 2, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 2, 1, 2, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 }));
        System.out.println(is121Array(new int[] { 1, 1, 1, 1, 1, 1 }));
        System.out.println(is121Array(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 }));
        System.out.println(is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2 }));
        System.out.println(is121Array(new int[] { 2, 2, 2 }));
        System.out.println("sec");
        // System.out.println(is121ArrayOne(new int[] { 1, 2, 1 }));
        // System.out.println(is121ArrayOne(new int[] { 1, 1, 2, 2, 2, 1, 1 }));
        // System.out.println(is121ArrayOne(new int[] { 1, 1, 2, 2, 2, 1, 1, 1 }));
        // System.out.println(is121ArrayOne(new int[] { 1, 1, 2, 1, 2, 1, 1 }));
        // System.out.println(is121ArrayOne(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3
        // }));
        // System.out.println(is121ArrayOne(new int[] { 1, 1, 1, 1, 1, 1 }));
        // System.out.println(is121ArrayOne(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1
        // }));
        // System.out.println(is121ArrayOne(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2
        // }));
        // System.out.println(is121ArrayOne(new int[] { 2, 2, 2 }));
    }
}
