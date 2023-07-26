package exercise.chapter_57;

import java.io.*;

public class BufferedStringTest {
    public static void main(String[] args) {
        try(FileReader fis = new FileReader("src/exercise/chapter_57/tet_long.txt");
            FileWriter fws = new FileWriter("src/exercise/chapter_57/output_long.txt")) {
            long start = System.currentTimeMillis();
            int data;
            while((data = fis.read()) != -1){
                fws.write(data);
            }
            long end = System.currentTimeMillis();

            System.out.println(end-start+"ms");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ///
        try(BufferedReader bfr= new BufferedReader(new FileReader("src/exercise/chapter_57/tet_long.txt"));
            BufferedWriter bfw = new BufferedWriter(new FileWriter("src/exercise/chapter_57/output_long.txt"))) {
            long start = System.currentTimeMillis();
            int data;
            while((data = bfr.read()) != -1){
                bfw.write(data);
            }
            long end = System.currentTimeMillis();

            System.out.println(end-start+"ms");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
