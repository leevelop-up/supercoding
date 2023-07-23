package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {
    static final int size= 100000;
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList1 = new LinkedList<>();
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            integerList.get(i);
        }
        endTime = System.currentTimeMillis();

        System.out.println("ArrayList get : "+ (endTime-startTime)+"ms");

        startTime = System.currentTimeMillis();
        for (int i=0; i<size; i++){
            integerList1.get(i);
        }
        endTime = System.currentTimeMillis();

        System.out.println("Linked get : "+ (endTime-startTime)+"ms");
    }
}
