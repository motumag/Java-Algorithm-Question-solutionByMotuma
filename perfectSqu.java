public class perfectSqu {
    static int nextPerfectSquare(int n) {
        int nextPerfectSquare = 1;

        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        for (int i = 0; i < n; i++)
            if (i * i > n) {
                nextPerfectSquare = i * i;
                break;
            }

        return nextPerfectSquare;
    }

    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }
}
