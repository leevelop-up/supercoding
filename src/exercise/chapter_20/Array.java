package exercise.chapter_20;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] intArr = new int[10];
        int[] intArr2 = new int[]{1,2,3,4,5};
        int[] intArr3 = {1,2,3,4,5};

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.toString(intArr3));

    }
}

/*
    array선언
    int[] scores = new int[30];
    - 어떤타입인지 + []
    - new호출이 필요
    - 배열의 사이즈 선턴

    //같은 맥락
    int[] intArr = new int[10];
    int[] intArr2 = new int[]{1,2,3,4,5};
    int[] intArr3 = {1,2,3,4,5};

    반복문 사용하여 배열 출력
    for(int i=0; i < studentScores.length; i++){
            System.out.printf("이 배열의 %d 인텍스의 값은 %d이다.\n",i, studentScores[i]);
    }
    //다른 for문 방법
    for(int score: studentScores){
        System.out.printf("값음 %d이다.",score);
    }


 */
