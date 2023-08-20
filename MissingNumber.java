public class MissingNumber {
    public static int missingNumber(int[] a) {
        int missedNumber = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (i < a.length - 1 && a[i + 1] - a[i] > 1) {
                missedNumber = a[i] + 1;
                break;
            }
        }
        return missedNumber;
    }

    public static int getMissingNo(int[] nums) {
        int n = nums.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr3 = { 1, 2, 2, 4, 5 };
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));

        System.out.println(getMissingNo(arr));
        System.out.println(getMissingNo(arr2));
    }
}
