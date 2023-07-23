package exercise.chapter_44;

public class BasicClass {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        String str3 = new String("Cat");
        String str4 = new String("Cat");
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);



        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);

//        char[] chars = {'a','b','c'};
//        //char타입 string으로 변환
//        String str1 = new String(chars);
//        String str2 = String.valueOf(chars);
//
//        char[] chars2 = str1.toCharArray();
//        for(char ch: chars2){
//            System.out.println(ch);
//        }
//        System.out.println(str1.charAt(0));0
    }
}

/*
    Java String

    String은 final char[] 문자열을 가진다.


    "==" vs "equals"

    == ": 항상 두 변수의 메모리 주소 값 비교
    "equals" : 기보은 "=="과 같지만, 하위 클래스에서 재정의 가능

    Java String은 불변성을 가진다.
    String str = "cat";
    str.concat(str+"asdf"); 할 경우 메모리에 계속 쌓이게 된다.
    => String Builder를 사용하여 해당 문제를 해결 할 수 있다.



    System클래스(유틸리티 클래스)
    운영체제 시스템 관련 기능 수행
     - 입출력관리, 시간측정, 환경병수접근, gc호출 등


    Math클래서(유틸리티 클래스)
    여러 수학 계산관련 메서드 제공
     - abs,ceil,max,min,sqrt,round,random 등



 */
