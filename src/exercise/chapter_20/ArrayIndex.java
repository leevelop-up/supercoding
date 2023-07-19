package exercise.chapter_20;

import java.util.Arrays;

public class ArrayIndex {
    public static void main(String[] args){
        //{90,87,88,75,99,65}

        int[] studentScores = {90,87,88,75,99,65};
        System.out.println(studentScores[0]);

        studentScores[2] = 93;
        System.out.println(Arrays.toString(studentScores));

        //error
        System.out.println(studentScores[6]);
    }
}
