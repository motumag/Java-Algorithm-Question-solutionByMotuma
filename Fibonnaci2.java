public class Fibonnaci2 {
    static int isFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int fbnumber = 0;
        while (fbnumber < n) {
            fbnumber = f1 + f2;
            f1 = f2;
            f2 = fbnumber;
        }
        if (fbnumber == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(3));
        System.out.println(isFibonacci(4));
    }
}
