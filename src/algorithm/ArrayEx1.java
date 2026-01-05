package algorithm;

import java.util.Arrays;

public class ArrayEx1{
    public ArrayEx1() {
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println("==System.out.println(arr)==");
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("==index 변경: o(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));
        System.out.println("==index 조회: o(1)==");
        System.out.println("arr[2] = " + arr[2]);
        System.out.println("==배열 검색: o(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;

        for(int i = 0; i < arr.length; ++i) {
            System.out.println("arr[" + i + "]: " + arr[i]);
            if (arr[i] == value) {
                System.out.println("찾음");
                break;
            }
        }

    }
}
