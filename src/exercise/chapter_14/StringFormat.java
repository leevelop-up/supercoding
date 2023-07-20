package exercise.chapter_14;

public class StringFormat {
    public static void main(String[] args) {
        String str1 = "Happy";
        String str2 = String.valueOf(123);
        System.out.println(str1);
        System.out.println(str2);


        String result;
        result = String.format("문자서식: %s, %s",str1,str1);
        System.out.println(result);
    }

}
