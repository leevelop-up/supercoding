package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionAdd {
    public static void main(String[] args){
        int[][] arr1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        int[][] arr2 = {
                {13,23,33,43},
                {53,63,73,83},
                {39,130,131,132}

        };

        int[][] resultArr = new int[3][4];
        for(int row = 0; row < 3; row++){
            for(int col = 0; col<4; col++){
                resultArr[row][col] = arr1[row][col]+arr2[row][col];
            }

        }
        System.out.println(Arrays.deepToString(resultArr));
    }
}
