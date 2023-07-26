package exercise.chapter_57;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args){
        String content = "this is content of fil1111e";

        try(FileOutputStream fos = new FileOutputStream("src/exercise/chapter_57/output.txt",true)) {
            byte[] bytes = content.getBytes();

            fos.write(bytes);

            System.out.println("txt파일이 생성되었습니다.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
