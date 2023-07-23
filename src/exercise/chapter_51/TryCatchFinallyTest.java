package exercise.chapter_51;

public class TryCatchFinallyTest {
    public static void main(String[] args){
        System.out.println("메소드 실행");


        try{
            Integer myInt = 14;
            Integer data = 100/myInt;

            if(myInt == 14) return;

            System.out.println(data);
        }catch (ArithmeticException e){
            System.out.println("에러");
            e.printStackTrace();
        }finally {
            System.out.println("여기는 무조건 실행되는 영역");
        }
        System.out.println("메소드 종료");

    }
}
