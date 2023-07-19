package exercise.chapter_21;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
//        int a= 5;
//        int b = a;
//        b+=5;
//
//        System.out.println(a);
//        System.out.println(b);
//
//
//        int[] arr1 = {1,2,3,4};
//        int[] arr2 = arr1;
//
//        arr1[0] = 10;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
        /*
        5
        10
        [10, 2, 3, 4]
        [10, 2, 3, 4]
        얕은 복사 = 같은 물건에 이름 붙이는 것



        깊은 복사 = 실제로 물건의 값을 바꾸는것

        리터럴과 객체 복사의 차이
        리터럴=> 유일한 상수여서 항상 값 자체가 복사됨.

        deep copy 구현하기
         2차원 배열은 .clone함수가 안됨!
         for문을 이용하여 row값이 돌때마다 clone필요
       */
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[arr.length];

        //방법1
        for(int i =0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        //방법2
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        //방법3 (가장많이 사용)
        int[] arr3 = arr.clone();
            //
        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        //2차원배열은 clone()이 안됨

        int[][] arrr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][] arrr1 = arrr.clone();
        int[][] arrr2 = new int[3][];

        //2차원배열은 로우값 마다 clone()을 해줘야 한다.
        for(int row = 0; row < 3; row++){
            arrr2[row] = arrr1[row].clone();
        }
        arrr[0][0] = 100;

        System.out.println(Arrays.deepToString(arrr));
        System.out.println(Arrays.deepToString(arrr1));
        System.out.println(Arrays.deepToString(arrr2));

    }

}
