public class FancyNumber {
    static int isFancy(int n) {
        if (n == 1)
            return 1;

        int fancyNumber = 0;
        int fancy1 = 1;
        int fancy2 = 1;

        while (fancyNumber < n) {
            fancyNumber = ((fancy1 * 2) + (fancy2 * 3));
            fancy1 = fancy2;
            fancy2 = fancyNumber;
        }
        if (fancyNumber == n)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
        System.out.println(isFancy(62));
    }
}
