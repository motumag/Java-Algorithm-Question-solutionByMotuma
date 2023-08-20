public class MerraArray {
    public static int isMerra(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            if (isPrime(arr[k]) == 1) {
                if (isZeroExist(arr)) {
                    return 1;
                }
            } else if (isPrime(arr[k]) == 0) {
                if (!isZeroExist(arr)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int isMerraArray(int[] arr) {
        int countPrime = 0;
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == 1) {
                countPrime++;
                break;
            }
            if (arr[i] == 0) {
                countZero++;
                break;
            }
        }
        if ((countZero == 1 && countPrime == 1) || (countPrime == 0 && countZero == 0)) {
            return 1;
        }
        return 0;
    }

    public static int isMerraArrayBestWay(int[] arr) {
        boolean zeroFlag = false;
        boolean primeFlag = false;
        for (int mera : arr) {
            if (mera == 0) {
                zeroFlag = true;
            }
            if (isPrime(mera) == 1) {
                primeFlag = true;
            }
        }
        if ((zeroFlag && primeFlag) || (!zeroFlag && !primeFlag)) {
            return 1;
        }
        return 0;
    }

    public static int isMeera2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] * 2) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int isMeera3(int numb) {
        int count = 0;
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                count++;
            }
        }
        if (numb % count == 0) {
            return 1;
        }
        return 0;

    }

    public static int isMeera4(int[] a2) {
        int sum = 0;
        for (int i = 0; i < a2.length; i++) {
            if (a2[i] > i) {
                return 0;
            }
            sum = sum + a2[i];
        }
        if (sum == 0) {
            return 1;
        }
        return 0;

    }

    public static boolean isZeroExist(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        if (count >= 1) {
            return true;
        }
        return false;
    }

    public static int isPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = { 3, 7, 0, 8, 0, 5 };
        int[] b = { 6, 10, 0 };
        int[] c = { 7, 6, 0, 10, 1 };
        int[] d = { 6, 10, 1 };
        // System.out.println(isMerra(new int[] { -4, 0, 1, 0, 2 }));
        // System.out.println(isMerra(new int[] { -1, 0, 0, 8, 0 }));
        // System.out.println(isMerra(a));
        // System.out.println(isMerra(b));
        // System.out.println(isMerra(c));
        // System.out.println(isMerra(d));

        // System.out.println(isMerraArray(a));
        // System.out.println(isMerraArray(b));
        // System.out.println(isMerraArray(c));
        // System.out.println(isMerraArray(d));

        // System.out.println(isMerraArrayBestWay(a));
        // System.out.println(isMerraArrayBestWay(b));
        // System.out.println(isMerraArrayBestWay(c));
        // System.out.println(isMerraArrayBestWay(d));

        // System.out.println(isMeera2(new int[] { 3, 5, -2 }));
        // System.out.println(isMeera2(new int[] { 8, 3, 4 }));
        // System.out.println("Mera number");
        // System.out.println(isMeera3(6));
        // System.out.println(isMeera3(30));
        // System.out.println(isMeera3(21));
        System.out.println("Mera4 number");
        System.out.println(isMeera4(new int[] { -4, 0, 1, 0, 2, 1 }));
        System.out.println(isMeera4(new int[] { -8, 0, 0, 8, 0 }));
        System.out.println(isMeera4(new int[] { -8, 0, 0, 2, 0 }));

    }
}
