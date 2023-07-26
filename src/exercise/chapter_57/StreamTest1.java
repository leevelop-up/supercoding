package exercise.chapter_57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args){

        //straem.of
        Stream<String> fruits = Stream.of("apple","banana","orange");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);



        //Arrays.Stream
        Stream<String> fruit2 = Arrays.stream(new String[]{"apple","banana","orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,9,10});

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");

        Stream<String> fruit3 = fruitList.stream();

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        Stream<Integer> integerStream3 = integerList.stream();

        for(String fruit:fruitList){
            System.out.println(fruit.toUpperCase());
        }

        //stream
        fruit3.forEach((fruit)-> System.out.println(fruit.toUpperCase()));

        for(Integer integer:integerList){
            if(integer%2 == 0){
                System.out.println(integer);
            }else{
                continue;
            }
        }

        integerStream3.filter((i) -> i%2 ==0)
                .filter((i) -> i >4)
                .forEach(i -> System.out.println(i));


        //stream은 한번사용했으면 다시 사용할 수 없다.
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed 에러 발생
        //integerStream3.forEach(i -> System.out.println(i));

    }
}
