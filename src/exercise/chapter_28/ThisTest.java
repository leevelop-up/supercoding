package exercise.chapter_28;

public class ThisTest {

    public static void main(String[] args){
        Person person1 = new Person("강철중");
        Person person2 = new Person("이민호","male");
        Person person3 = new Person("아이유","femail",10);

        person1.showMyself();
        person2.showMyself();
        person3.showMyself();

        Person person4 = person1.returnMySelf();
        System.out.println(person4);



    }
}
