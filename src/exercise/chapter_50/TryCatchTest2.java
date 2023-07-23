package exercise.chapter_50;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TryCatchTest2 {
    public static void main(String[] args){
        System.out.println("메소드 실행");
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("hello1");
        stringList.add("hello2");
        stringList.add("hello3");
        stringList.add(null);
        stringList.add("hello4");

        for (int i = 0; i<stringList.size()+1; i++){
            try {
                System.out.println("i : "+i);
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            }catch (NullPointerException e){
                System.out.println("null은 안되요");
            }catch (IndexOutOfBoundsException e){
                System.out.println("index는 array bound를 넘어갈수 없습니다.");
                break;
            }

        }
        System.out.println("메소드 종료");
    }
}
