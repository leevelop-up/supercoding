package exercise.chapter_57;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args){
        String content = "this is content of fil1111e";

        try(FileWriter fos = new FileWriter("src/exercise/chapter_57/test.txt",true)) {
            fos.write(content);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(PrintWriter pw = new PrintWriter(new FileWriter("src/exercise/chapter_57/test.txt"))) {
            pw.println("printwriter 예시");

            int value = 42;
            pw.println(value);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
