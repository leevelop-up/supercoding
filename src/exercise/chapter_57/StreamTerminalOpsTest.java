package exercise.chapter_57;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOpsTest {
    public static void main(String[] args){

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("apple");
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");
        fruitList.add("mango");
        fruitList.add("watermelon");

        //foreach: 출력
        fruitList.stream().forEach((fruit)-> System.out.println(fruit));
        //collect(): 다른 또는 같은 컬렉션 반환
        Set<String> fruitSet = fruitList.stream().collect(Collectors.toSet());
        System.out.println(fruitSet);

        //findefirst():stream의 첫번째 산출,optionanl
        Optional<String> fruitOptinal = fruitList.stream().findFirst();
        System.out.println(fruitOptinal.orElseGet(()->"기본과일"));






        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);

        //sum,average
        System.out.println(integerList.stream().mapToInt((i)->i).sum());
        System.out.println(integerList.stream().mapToInt((i)->i).average());

        //count,max,min
        System.out.println(integerList.stream().count());
        System.out.println(integerList.stream().mapToInt((i)->i).max());
        System.out.println(integerList.stream().mapToInt((i)->i).min());

        //reduce()
        int result = integerList.stream().reduce(0,(int1,int2)->int1+int2);
        System.out.println(result);

    }
}
