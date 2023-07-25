package exercise.chapter_53;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args){
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);

        int length = stringOptional.orElseThrow(()->{
            try {
                throw new Exception("asdfsadf");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).length();
        System.out.println(length);
    }
}
