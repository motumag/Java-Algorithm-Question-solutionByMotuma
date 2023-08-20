public class ContinousFactored {
    public static int isContinuousFactored(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && n % (i + 1) == 0)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(99));
    }
}
