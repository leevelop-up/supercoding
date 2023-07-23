package exercise.chapter_50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메소드 실행");
        makecheckException();
        System.out.println("메소드 종료");
    }

    public static void makeUncheckException(){
        int[] intArr ={1,2,3,4,5,6,7,8,9,10};
        int index = 10;

        System.out.println(intArr[index]);

    }
    public static void makecheckException() throws FileNotFoundException {
        File file = new File("exercise/chapter_50/test.txt");
        FileInputStream fs = new FileInputStream(file);
        System.out.println("실행");
    }

}
