package exercise.chapter_50;

import java.io.FileNotFoundException;

public class TryCatchTest1 {
    public static void main(String[] args){
        System.out.println("메소드 실행");

        try {
            int i = 10;
            int data = 50 /i;
            System.out.println(data);
        }catch (ArithmeticException e){

            System.out.println("0으로는 나눌 수 가 없습니다.");
            System.out.println(0);
            e.printStackTrace();
        }


        System.out.println("메소드 종료");
    }

}
