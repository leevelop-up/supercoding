package exercise.chapter_51;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptioinTest {
    public static void main(String[] args) throws IOException {
        try{
            printFile("src/exercise/chapter_50/test.txt");
        }catch (FileNotFoundException e){
            System.out.println("Filenotfione");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Ioexception");
            e.printStackTrace();
        }

    }

    static void printFile(String filename) throws FileNotFoundException, IOException {
        FileInputStream fs = getFileStream(filename);

        int i;
        while((i = fs.read()) != -1){
            System.out.write(i);
        }

    }


    static FileInputStream getFileStream(String filename) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(filename);
        return fs;
    }
}

