package exercise.chapter_20;

public class ArrayFor {
    public static void main(String[] args){
        int[] studentScores = {90,87,88,75,99,65};

        for(int i=0; i < studentScores.length; i++){
            System.out.printf("이 배열의 %d 인텍스의 값은 %d이다.\n",i, studentScores[i]);
        }
        //
        for(int score: studentScores){
            System.out.printf("값음 %d이다.",score);
        }

    }
}
