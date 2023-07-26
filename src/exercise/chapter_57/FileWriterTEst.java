package exercise.chapter_57;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTEst {

    public static void main(String[] args){
        String content = "this is content of fil1111e";

        try(FileWriter fos = new FileWriter("src/exercise/chapter_57/test_korean.txt",true)) {
           fos.write(content);
            System.out.println("txt파일이 생성되었습니다.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
