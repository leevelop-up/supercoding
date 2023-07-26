package exercise.chapter_56;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {
    public static void main(String[] args){
      String str = "asdf";

        Optional<String> stringOptional = Optional.ofNullable(str);
        Supplier<String> stringSupplier = () ->"defalut";
        String str2 = stringOptional.orElseGet(stringSupplier)
                .toUpperCase();

        System.out.println(str2);
    }
}
