package exercise.chapter_57;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름");
        String name = scanner.nextLine();
        System.out.println("직업");
        String job = scanner.nextLine();
        System.out.println("나이");
        String age = scanner.nextLine();


        System.out.println(name+job+age);


    }
}
