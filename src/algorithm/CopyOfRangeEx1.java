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


        // 범위를 벗어난 경우
        // 범위를 벗어나면 남은 값은 기본값으로 채워짐
        // int -> 0
        int[] subArray2 = Arrays.copyOfRange(numbers, 8, 12);
        System.out.println(Arrays.toString(subArray2));


        // 문자열 배열 복사
        // String -> null
        String[] fruits = {"Apple", "Banana"};

        String[] subArray3 = Arrays.copyOfRange(fruits, 0, 3);
        System.out.println(Arrays.toString(subArray3));
    }
}