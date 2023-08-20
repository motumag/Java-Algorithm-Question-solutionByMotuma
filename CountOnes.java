public class CountOnes {
    public static int countOnes(int n) {
        int count = 0;

        while (n > 0) {
            int digit = n % 2;
            n /= 2;
            if (digit == 1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOnes(9));
        System.out.println(countOnes(5));
        System.out.println(countOnes(15));

    }
}
