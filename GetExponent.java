public class GetExponent {
    public static int getExponent(int n, int p) {
        if (p <= 1)
            return -1;

        int count = 0;
        n = n > 0 ? n : -n;

        while (n > 0) {
            if (n % p == 0)
                count++;
            else
                break;

            n /= p;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getExponent(162, 3));
    }
}
