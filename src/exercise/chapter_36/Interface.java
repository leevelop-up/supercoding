package exercise.chapter_36;

public class Interface {
    public static void  main(String[] args){
        System.out.println(Flyable.atmosphereLimit);

        Flyable bird = new Bird();
        Flyable airplane = new Airplane("ab1222");

        bird.fly();
        airplane.fly();

        Walkable person = new Person();
        Person person1 = new Person();
        person1.setName("이동현");
        Walkable robot = new Robot("bbb");

        person.walk();
        robot.walk();
        //다운 캐스팅
        if(robot instanceof Robot){
            Robot robot1 = (Robot) robot;
            robot1.helpPerson(person1);
        }
    }
}



/*
인터페이스
 - 커뮤니케이션이 가능하도록 설계한 상호 작용 방식
 - 유저 인터페이스(사물과 유저),시스템 인터페이스(사물과 사물)
 - 자바 객체간 커뮤니케이션이 가능하도록 기능 구현을 설계(메소드)하는 추상화 문법

디폴트 메소드
default void fly(){내용}
디폴트 메소드가 있을경우 클래스생성후 implement 할시 override하라고 안뜸

 */
