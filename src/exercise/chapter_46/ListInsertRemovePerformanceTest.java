package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {
    static final int size= 9999;
    public static void main(String[] args) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        List<Integer> integerList = new ArrayList<>();
        for (int i=0; i<size; i++){
            integerList.add(i);
            if((i&5) ==0) integerList.remove(0);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList 삽입삭제 : "+ (endTime-startTime)+"ms");



        startTime = System.currentTimeMillis();
        List<Integer> integerList1 = new LinkedList<>();
        for (int i=0; i<size; i++){
            integerList1.add(i);
            if((i&5) ==0) integerList1.remove(0);
        }
        endTime = System.currentTimeMillis();

        System.out.println("Linked 삽입삭제 : "+ (endTime-startTime)+"ms");
    }
}
