package exercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();

        fruitList.add("orange");
        fruitList.add("banana");
        fruitList.add("tomato");
        fruitList.add("kiwi");

        System.out.println(fruitList);
        //add(index, element)

        fruitList.add(3,"apple");
        System.out.println(fruitList);
        fruitList.remove(3);
        System.out.println(fruitList);

        String myFruit = fruitList.get(3);
        System.out.println(myFruit);

        fruitList.set(1,"pineapple");
        System.out.println(fruitList);

        System.out.println(fruitList.size());
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList2.isEmpty());
        System.out.println(fruitList.isEmpty());

        //contains: 리스트에 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println(fruitList.contains("kiwi"));
        System.out.println(fruitList.contains("apple"));

        //indexof, clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        String myFruit3 = "pineapple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
        System.out.println(fruitList);


    }
}
