public class TriangularNumber {
    static int isTriangular(int n) {
        int sum = 0;
        for (int i = 1; sum < n; i++) {
            sum += i;
        }
        if (sum == n)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isTriangular(1));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(4));
        System.out.println(isTriangular(6));
        System.out.println(isTriangular(10));
        System.out.println(isTriangular(11));
        System.out.println(isTriangular(12));
    }
}
