public class CompleteArray {
    public static int isComplete(int[] a) {
        boolean evenFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenFlag = true;
                break;
            }
        }
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                counter++;
            }
        }
        int[] newArr = new int[counter];
        for (int i = 0; i < newArr.length; i++) {
            if (a[i] % 2 == 0) {
                newArr[i] = a[i];
            }
        }

        if (evenFlag) {
            boolean iexistFlag = false;
            int getMin = findMin(newArr);
            int getMax = findMax(newArr);
            if (getMax != getMax) {
                for (int m = getMin + 1; m <= getMax; m++) {
                    for (int j = 0; j < a.length; j++) {
                        if (a[m] == a[j]) {
                            iexistFlag = true;
                        }
                    }

                }
            }
            if (!iexistFlag) {
                return 0;
            }

        }
        return 1;
    }

    public static int findMin(int[] min) {
        int minNum = min[0];
        for (int i = 1; i < min.length; i++) {
            if (min[i] < minNum) {
                minNum = min[i];
            }

        }
        return minNum;
    }

    public static int findMax(int[] max) {
        int maxNum = max[0];
        for (int i = 1; i < max.length; i++) {
            if (max[i] > maxNum) {
                maxNum = max[i];
            }

        }
        return maxNum;
    }

    public static int isComplete2(int[] a) {
        boolean containsEven = false;
        for (int num : a) {
            if (num % 2 == 0) {
                containsEven = true;
                break;
            }
        }

        if (!containsEven) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            if (num % 2 == 0) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }
        if (min == max) {
            return 0;
        }
        for (int i = min + 1; i < max; i++) {
            boolean found = false;
            for (int num : a) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return 0;
            }
        }

        return 1;
    }

    public static int isCompleteArray(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                return 0;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
        }
        System.out.println(max);
        for (int k = 0; k < max; k++) {
            boolean flag = false;
            if (a[k] % 2 == 0 && a[k] < max) {
                for (int j = 0; j < a.length; j++) {
                    if (k == a[j]) {
                        flag = true;
                    }
                }
            }
            if (!flag) {
                return 0;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        // System.out.println(isComplete2(new int[] { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7
        // }));
        // System.out.println(isComplete2(new int[] { 5, 7, 9, 13 }));
        // System.out.println(isComplete2(new int[] { 2, 2 }));
        // System.out.println(isComplete2(new int[] { 2, 6, 3, 4 }));
        System.out.println(isCompleteArray(new int[] { 2, 3, 2, 4, 11, 6, 10, 9, 8 }));
        // int max = Integer.MIN_VALUE;
        // System.out.println(max);
    }
}
