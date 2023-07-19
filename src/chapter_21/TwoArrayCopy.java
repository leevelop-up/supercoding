package chapter_21;

import java.util.Arrays;

public class TwoArrayCopy {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[][] arr1 = arr.clone();
        int[][] arr2 = new int[3][];

        //2차원배열은 로우값 마다 clone()을 해줘야 한다.
        for(int row = 0; row < 3; row++){
            arr2[row] = arr1[row].clone();
        }
        arr[0][0] = 100;

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

    }
}
