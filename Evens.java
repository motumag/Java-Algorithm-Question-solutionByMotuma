public class Evens {
    public static int isEvens(int n) {
        int counter = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit % 2 != 0) {
                counter++;
            }
        }
        if (counter >= 1) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isEvens(2426));
        System.out.println(isEvens(3224));
    }
}
