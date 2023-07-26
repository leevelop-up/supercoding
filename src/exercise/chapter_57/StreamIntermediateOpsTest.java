package exercise.chapter_57;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {
    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");
        fruitList.add("apple");
        fruitList.add("mango");
        fruitList.add("watermelon");

        //filter : fruit이름의 길이가 6 이상인 과일
        fruitList.stream().filter((fruit)-> fruit.length() >=6)
                .forEach((fruit)-> System.out.println(fruit));

        //distinct 중복 제거
        System.out.println(fruitList.stream().distinct().collect(Collectors.toList()));

        //map 과일이름 대문자로 변경
        List<String> fruitmap = fruitList.stream().map((fruit)->fruit.toUpperCase()).collect(Collectors.toList());
        System.out.println(fruitmap);

        //글자수
        List<Integer> fruitmap1 = fruitList.stream().map((fruit)->fruit.length()).collect(Collectors.toList());
        System.out.println(fruitmap1);

        //limit: 앞에 3개만
        List<String> fruitlimit = fruitList.stream().limit(3).collect(Collectors.toList());
        System.out.println(fruitlimit);

        //skip: 앞에 3개 제한
        List<String> fruitskip = fruitList.stream().skip(3).collect(Collectors.toList());
        System.out.println(fruitskip);

        //sorted: 정렬
        List<String> fruitssort = fruitList.stream().sorted().collect(Collectors.toList());
        System.out.println(fruitssort);

        //sorted : 길이가 짧은순
        List<String> fruitsort = fruitList.stream().sorted((fruit1,fruit2)->fruit1.length()-fruit2.length()).collect(Collectors.toList());
        System.out.println(fruitsort);



    }
}
