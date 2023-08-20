public class GutherieIndex {
    public static int guthrieIndex(int n) {
        int index = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(guthrieIndex(7));
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));
    }
}
