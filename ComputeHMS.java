import java.util.Arrays;

public class ComputeHMS {
    static int[] computeHMS(int seconds) {
        int hour = seconds / 3600;
        seconds = seconds % 3600;

        int minute = seconds / 60;
        seconds = seconds % 60;
        
        int second = seconds;

        int nonZeroCount = (hour > 0 ? 1 : 0) + (minute > 0 ? 1 : 0) + 1;

        int[] hms = new int[nonZeroCount];
        int index = 0;

        if (hour > 0) {
            hms[index] = hour;
            index++;
        }

        if (minute > 0) {
            hms[index] = minute;
            index++;
        }

        hms[index] = second;

        return hms;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

}
