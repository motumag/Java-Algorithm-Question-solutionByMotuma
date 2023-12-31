public class CubicPowerFull {
    public static int isCubePowerful(int n) {
        if (n <= 0) {
            return 0;
        }
        int sum = 0;
        int originalN = n;
        while (n > 0) {
            int digit = n % 10;
            int cubic = digit * digit * digit;
            sum += cubic;
            n = n / 10;
        }

        if (sum == originalN) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }
}
