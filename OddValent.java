public class OddValent {
    public static int isOddValent3(int[] a) {
        int counter1 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter1++;
                }
            }
        }
        int count2 = 0;
        for (int k = 0; k < a.length; k++) {
            if (a[k] % 2 != 0) {
                count2++;
                break;
            }
        }
        if (count2 >= 1 && counter1 >= 1) {
            return 1;
        }
        return 0;
    }

    static int isOddValent2(int[] a) {
        boolean occurrenceFlag = false;
        boolean oddFlag = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddFlag = true;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    occurrenceFlag = true;
                    break;
                }
            }
            if (oddFlag && occurrenceFlag)
                return 1;
        }
        return 0;
    }

    static int isOddValent(int[] a) {
        boolean oddFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddFlag = true;
                break;
            }
        }
        int counter = 0;
        for (int j = 0; j < a.length; j++) {
            for (int k = j + 1; k < a.length; k++) {
                if (a[j] == a[k]) {
                    counter++;
                }
            }
            // if (counter >= 2) {
            // break;
            // }
        }
        if (oddFlag && counter >= 1)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int[] a = { 9, 3, 4, 9, 1 };
        int[] b = { 3, 3, 3, 3 };
        int[] c = { 1, 2, 3, 4, 5 };
        int[] d = { 2, 2, 2, 4, 4 };
        int[] e = { 8, 8, 8, 4, 4, 7, 2 };
        System.out.println(isOddValent(a));
        System.out.println(isOddValent(b));
        System.out.println(isOddValent(c));
        System.out.println(isOddValent(d));
        System.out.println(isOddValent(e));
        System.out.println();
        // System.out.println(isOddValent2(new int[] { 9, 3, 4, 9, 1 }));
        // System.out.println(isOddValent2(new int[] { 3, 3, 3, 3 }));
        // System.out.println(isOddValent2(new int[] { 8, 8, 8, 4, 4, 7, 2 }));
        // System.out.println(isOddValent2(new int[] { 1, 2, 3, 4, 5 }));
        // System.out.println(isOddValent2(new int[] { 2, 2, 2, 4, 4 }));
    }
}
