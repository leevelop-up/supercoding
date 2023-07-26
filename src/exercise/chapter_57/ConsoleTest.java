package exercise.chapter_57;

import java.io.IOException;

public class ConsoleTest {
    public static void main(String[] args){
        int i;

        System.out.println("입력값을 넣어주세요");
        try {
            StringBuilder sb = new StringBuilder();
            while((i = System.in.read()) != '\n'){
                sb.append((char)i);
            }
            System.out.println(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
