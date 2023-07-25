package exercise.chapter_51;

import java.io.IOException;

public class ThrowUncheckExceprion {
    public static void main(String[] args){
        System.out.println("메인 메소드 실행");
        int myINt = 0;
        try{
         myINt = getIntElement(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(myINt);



        System.out.println("메인 메소드 종료");
    }

    static int getIntElement(int index) throws Exception {
        int[] arrInt = {1,2,3,4,5,6,7,8,9,10};
        if(index >= arrInt.length){
            throw new Exception(" 길이를 넘었습니다.");
        }
        return arrInt[index];
    }


}
