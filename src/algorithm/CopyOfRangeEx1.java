package algorithm;

import java.util.Arrays;

public class CopyOfRangeEx1 {
    public CopyOfRangeEx1() {
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] subArray = Arrays.copyOfRange(numbers, 2, 6);
        System.out.println(Arrays.toString(subArray));

        int[] subArray1 = Arrays.copyOfRange(numbers, 0, 6);
        System.out.println(Arrays.toString(subArray1));
    }
}