import java.util.Arrays;

public class ResEqual {
    public static int repsEqual2(int[] a, int n) {
        int count = 0;
        int copyOfN = n;
        while (copyOfN > 0) {
            int digit = copyOfN % 10;
            count++;
            copyOfN = copyOfN / 10;
        }
        if (a[0] == 0) {
            count++;
        }
        int[] temp = new int[count];
        if (a.length != temp.length) {
            return 0;
        }
        int j = a.length - 1;
        while (n > 0) {
            int digit = n % 10;
            temp[j--] = digit;
            n = n / 10;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != temp[i]) {
                return 0;
            }
        }
        return 1;
    }

    static int repsEqual(int[] a, int n) {
        for (int i = a.length - 1; i >= 0; i--) {
            int rem = n % 10;
            n = n / 10;
            if (a[i] != rem)
                return 0;
        }

        if (n != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(repsEqual(new int[] { 3, 2, 0, 5, 3 }, 32053));
        System.out.println(repsEqual(new int[] { 3, 2, 0, 5 }, 32053));
        System.out.println(repsEqual(new int[] { 3, 2, 0, 5, 3, 4 }, 32053));
        System.out.println(repsEqual(new int[] { 2, 3, 0, 5, 3 }, 32053));
        System.out.println(repsEqual(new int[] { 0, 3, 2, 0, 5, 3 }, 32053));
    }
}
