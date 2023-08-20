public class BAQNumber {
    public static int findSmallestBEQnumber() {
        int number = 1;

        while (true) {
            int cube = number * number * number;
            int count = countSixes(cube);
            if (count == 4) {
                return number;
            }
            number++;
        }
    }

    public static int countSixes(int cubedNumber) {
        int counter = 0;
        while (cubedNumber > 0) {
            int x = cubedNumber % 10;
            if (x == 6) {
                counter++;
            }
            cubedNumber = cubedNumber / 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        // System.out.println(findSmallestBEQnumber(806));
        System.out.println(findSmallestBEQnumber());
    }
}
