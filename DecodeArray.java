public class DecodeArray {
    static int decodeArray(int[] a) {
        int sum = 0;

        for (int i = a.length - 1; i > 0; i--) {
            int digit = (a[i] - a[i - 1]) > 0 ? (a[i] - a[i - 1]) : -(a[i] - a[i - 1]);
            for (int j = i; j < a.length - 1; j++) {
                digit *= 10;
            }
            sum += digit;
        }

        // for (int i = 1; i < a.length; i++) {
        // int digit = (a[i] - a[i - 1]) > 0 ? (a[i] - a[i - 1]) : -(a[i] - a[i - 1]);

        // for (int j = i; j < a.length - 1; j++) {
        // digit *= 10;
        // }
        // sum += digit;
        // }

        if (a[0] < 0)
            return -sum;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[] { 2, -3, -2, 6, 9, 18 }));
    }
}
