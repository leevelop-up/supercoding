package exercise.chapter_44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) {
        Customer customer = new Customer("민철");
        Class clazz = customer.getClass();

        Constructor[] constructors = clazz.getConstructors();

        for(Constructor constructor:constructors){
           // System.out.println(constructor);
        }

        Method[] methods = clazz.getMethods();
        for(Method method: methods){
            //System.out.println(method);
        }

        Field[] fields = clazz.getDeclaredFields();
        for(Field field: fields){
            System.out.println(field);
        }



    }
}
