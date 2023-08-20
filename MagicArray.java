public class MagicArray {
    public static int isMagicArray(int[] a) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                count++;
                sum += a[i];
            }
        }
        if ((a[0] == sum) || (count == 0 && a[0] == 0)) {
            return 1;
        }
        return 0;
    }

    public static boolean isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isMagicArray(new int[] { 21, 3, 7, 9, 11, 4, 6 }));
        System.out.println(isMagicArray(new int[] { 13, 4, 4, 4, 4 }));
        System.out.println(isMagicArray(new int[] { 10, 5, 5 }));
        System.out.println(isMagicArray(new int[] { 3 }));
        System.out.println(isMagicArray(new int[] { 0, 6, 8, 20 }));
        System.out.println(isMagicArray(new int[] { 8, 5, -5, 5, 3 }));
    }
}
