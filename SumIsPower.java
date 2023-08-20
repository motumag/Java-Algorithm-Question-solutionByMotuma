public class SumIsPower {
    public static boolean sumIsPower(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int count = 0;
        int totSum = sum;
        while (totSum > 0) {
            if (totSum % 2 == 0) {
                count++;
            }
            totSum = totSum / 2;
        }
        int sumPower = (int) Math.pow(2, count);
        if (sum == sumPower) {
            return true;
        }
        // if not allowed to use Math.pow
        // int sumPower = 1;
        // for (int i = 0; i < count; i++) {
        // sumPower *= 2;
        // }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(sumIsPower(new int[] { 8, 8, 8, 8 }));
        System.out.println(sumIsPower(new int[] { 8, 8, 8 }));
    }
}
