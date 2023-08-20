public class Henry {
    static int henry(int i, int j) {
        int count = 0;
        int result = 0;
        int largest = i > j ? i : j;
        for (int k = 1; k < Integer.MAX_VALUE && count < largest; k++) {
            int sum = 0;
            for (int factorNumber = 1; factorNumber < k; factorNumber++) {
                if (k % factorNumber == 0) {
                    sum += factorNumber;
                }
            }
            if (k == sum) {
                count++;
                if (count == i || count == j) {
                    result += sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }
}
