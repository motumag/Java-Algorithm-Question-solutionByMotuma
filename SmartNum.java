public class SmartNum {
    public static int isSmart(int n) {
        int sum = 1;
        for (int i = 1; sum <= n; i++) {
            sum += i;
            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }

    public static int isSmart2(int n) {
        if (n <= 0) {
            return 0;
        }
        int curr = 1;
        for (int k = 1; curr < n; k++) {
            curr += k;
        }
        if (curr == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSmart(22));
        System.out.println(isSmart(11));
        System.out.println(isSmart(5));
        System.out.println(isSmart(8));
    }
}
