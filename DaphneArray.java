public class DaphneArray {
    public static int isDaphne(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                counter++;
            }
        }
        if (counter == a.length || counter == 0) {
            return 1;
        }
        return 0;
    }

    static int isDaphne1(int[] a) {
        boolean evenFlag = false;
        boolean oddFlag = false;

        for (int anA : a) {
            if (anA % 2 == 0) {
                evenFlag = true;
            } else {
                oddFlag = true;
            }

            if (evenFlag && oddFlag)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 2 };
        int[] b = { 1, 3, 17, -5 };
        int[] c = { 3, 2, 5 };
        System.out.println(isDaphne(a));
        System.out.println(isDaphne(b));
        System.out.println(isDaphne(c));
        System.out.println();
        System.out.println(isDaphne1(a));
        System.out.println(isDaphne1(b));
        System.out.println(isDaphne1(c));
    }
}
