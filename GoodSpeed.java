public class GoodSpeed {
    public static int goodSpread(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c++;
                }
            }
            if (c > 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(goodSpread(new int[] { 2, 1, 2, 5, 2, 1, 5, 9 }));
        System.out.println(goodSpread(new int[] { 3, 1, 3, 1, 3, 5, 5, 3 }));
    }
}
