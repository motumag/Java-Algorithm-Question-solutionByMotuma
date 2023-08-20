public class VanillaArray {
    public static int isVanilla(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        for (int x : a) {
            x = x < 0 ? -x : x;
            int digit = x % 10;
            while (x > 0) {
                int remend = x % 10;
                x = x / 10;
                if (digit != remend) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[] { 1, 1, 11, 1111, 1111111 }));
        System.out.println(isVanilla(new int[] { 11, 101, 1111, 11111 }));
        System.out.println(isVanilla(new int[] { 11, 222, 1111, 11111 }));
        System.out.println(isVanilla(new int[] { 1 }));
        System.out.println(isVanilla(new int[] {}));
    }
}
