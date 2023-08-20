import java.util.Arrays;

public class SmallFactors {
    public static boolean hasKSmallFactors(int k, int n) {
        int count = 0;
        for (int i = 1; i < k; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] a = new int[count];
        int index = 0;
        for (int j = 1; j < k; j++) {
            if (n % j == 0) {
                a[index++] = j;

            }
        }
        for (int l = 0; l < a.length - 1; l++) {
            if (a[l] * a[l + 1] == n) {
                if (a[l] < k && a[l + 1] < k)
                    return true;
            }
        }
        return false;
    }

    public static boolean hasKSmallFactors1(int k, int n) {
        if (k <= 0 || n <= 0) {
            return false;
        }
        for (int u = 1; u < k; u++) {
            if (n % u == 0) {
                int v = n / u;
                if (v < k) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(10, 20));
        System.out.println(hasKSmallFactors(6, 20));
        System.out.println(hasKSmallFactors(7, 20));
        System.out.println(hasKSmallFactors(8, 20));
        System.out.println(hasKSmallFactors(10, 22));
        System.out.println(hasKSmallFactors(7, 30));
        System.out.println(hasKSmallFactors(6, 14));
        System.out.println(hasKSmallFactors(6, 30));

        System.out.println("new===========");
        System.out.println(hasKSmallFactors1(10, 20));
        System.out.println(hasKSmallFactors1(6, 20));
        System.out.println(hasKSmallFactors1(7, 20));
        System.out.println(hasKSmallFactors1(8, 20));
        System.out.println(hasKSmallFactors1(10, 22));
        System.out.println(hasKSmallFactors1(7, 30));
        System.out.println(hasKSmallFactors1(6, 14));
        System.out.println(hasKSmallFactors1(6, 30));
    }
}
