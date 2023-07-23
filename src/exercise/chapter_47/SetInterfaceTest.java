package exercise.chapter_47;

import java.util.*;

public class SetInterfaceTest {
    public static void main(String[] args) {

        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("orange");
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("kiwi");
        fruitSet.add("Melon");
        fruitSet.add("kiwi");
        System.out.println(fruitSet);

        List<String> fruitList = new ArrayList<>();
        fruitList.add("orange");
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("kiwi");
        fruitList.add("kiwi");
        System.out.println(fruitList);

        //remove(set)
        fruitSet.remove("kiwi");

        //container
        fruitSet.contains("apple");
        fruitSet.contains("mango");

        //Size, isEmpty, Clear
        System.out.println(fruitSet.size());

        fruitSet.clear();
        System.out.println(fruitSet.isEmpty());


    }
}
