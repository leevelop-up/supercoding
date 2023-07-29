package exercise.chapter_58;

import java.io.*;

public class SerializeExampleTest {
    public static void main(String[] args) {

        Person person = new Person("이순신", "male",30,"한국","장수");
        byte[] serializedData = null;
        try(ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);
        ) {
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();

            serializedData= bao.toByteArray();
            System.out.println("직렬화 후"+new String(serializedData));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //역직렬화 후
        try(ByteArrayInputStream bio = new ByteArrayInputStream(serializedData);
        ObjectInputStream objectInputStream = new ObjectInputStream(bio)){
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("역직렬화 후"+person1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
