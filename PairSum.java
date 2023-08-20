import java.util.Arrays;

public class PairSum {
    public static int[] pairwiseSum(int[] a) {
        if (a.length <= 0 || a.length % 2 != 0)
            return null;

        int[] result = new int[a.length / 2];
        int index = 0;
        int sum = a[0] + a[1];
        result[index] = sum;
        for (int i = 2; i < a.length; i += 2) {
            sum += a[i] + a[i + 1];
            index++;
            result[index] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairwiseSum(new int[] { 2, 1, 18, -5 })));
    }
}
