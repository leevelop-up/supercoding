package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args){
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_50/test.txt");
            int i = 0;
            int data =100/i;
            String str = "abc";
            System.out.println(str.toUpperCase());

            int[] intArr = new int[10];
            int idx = 11;
            System.out.println(intArr[idx]);


        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("Artimetic또는 nullpoint 에러");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("exception 에러");
            e.printStackTrace();
        }
        System.out.println("메소드 종료");
    }
}
