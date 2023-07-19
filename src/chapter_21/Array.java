package chapter_21;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[][] arr1 = new int[10][5];
        int[][] arr2 = {{1,2,3,4},{6,7,8,9},{10,11,12,13}};

        System.out.println(Arrays.deepToString(arr2));

        int myInt = arr2[0][2];
        System.out.println(myInt);

        arr2[2][3] = 20;
        System.out.println(Arrays.deepToString(arr2));

        for(int row = 0; row < 3; row++){
            for(int col = 0; col<4; col++){
                System.out.printf("%d ",arr2[row][col]);
            }
            System.out.println("");
        }
    }
}

/*
    다차원 배열
    x[0][0] x[row][colum]
    선언 방법
    int[][] arr1 = new int[5][5];
    or
    int[][] arr1 = {{1,2,3,4},{6,7,8,9}}

   System.out.println(Arrays.toString(arr1));
   -> [[I@c818063, [I@3f0ee7cb, [I@75bd9247, [I@7d417077, [I@7dc36524, [I@35bbe5e8, [I@2c8d66b2, [I@5a39699c, [I@3cb5cdba, [I@56cbfb61]
   tostring을 쓰면 내용이 안나옴

   System.out.println(Arrays.deepToString(arr1));
   -> [[1, 2, 3, 4], [6, 7, 8, 9]]
   잘나옴



*/