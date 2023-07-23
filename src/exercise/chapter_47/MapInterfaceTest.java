package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        //Map정의
        Map<String,Integer> fruitMap = new HashMap<>();

        //Map 데이터를 넣음
        fruitMap.put("orange",3);
        fruitMap.put("apple",32);
        fruitMap.put("banana",31);
        fruitMap.put("kiwi",3);

        System.out.println(fruitMap);

        //Get(Key)
        Integer appleCount = fruitMap.get("apple");
        Integer bananaCount = fruitMap.get("banana");

        System.out.println(appleCount);
        System.out.println(bananaCount);

        //Countains(Key)
        Boolean isApple = fruitMap.containsKey("apple");
        Boolean isMango = fruitMap.containsKey("Mango");
        System.out.println(isMango);
        System.out.println(isApple);

        //remonve(key)
        fruitMap.remove("apple");
        System.out.println(fruitMap);

        //size
        System.out.println(fruitMap.size());

        //keyset()
        System.out.println(fruitMap.keySet());

    }
}

/*
Map 은 key-value 형태
용도는 key로 value를 검색
대표 구현체
1.HashMap (=array)
2.Treemap(=node)


Set 인터페이스
설명: 중복 없는 컬렉션
용도: 고유한 요소 검색
대표 구현체
1.HashSet(=array)
2.TreeSet(=node)


Hash 함수 3가지 용도로 사용
 - 데이터 무결성 검사
 - 데이터 암호화
 - 데이터 검색


 동작 방식
  1. 객체의 hashCode()호출
  2. Array구조 size로 %(나머지) 적용
  ex) 1. banana.hashcode() = -123444
      2. abs(-123444)%6(배열갯수) =4
    => Set의 경우 banana를 한번더 입력할 경우 banana가 이미 존재 하기 때문에 추가 불가!

 */