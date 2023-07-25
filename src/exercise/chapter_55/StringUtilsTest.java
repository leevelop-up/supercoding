package exercise.chapter_55;

public class StringUtilsTest {
    public static void main(String[] args){
        String str = "Hello, World";
        char target = 'o';
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println(isEmpty);

        String str2 = StringUtils.reverse(str);
        System.out.println(str2);


        int countChar = StringUtils.CharChecker.countChar(str,target);
        System.out.println(countChar);

        boolean containChar = StringUtils.CharChecker.countainsChar(str,target);
        System.out.println(containChar);







    }
}
