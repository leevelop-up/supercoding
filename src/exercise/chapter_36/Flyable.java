package exercise.chapter_36;

public interface Flyable {
    //속성
    long atmosphereLimit = 476; //static final이 이미 정의 되어있다.팅

    default void fly() {
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    }
    static void printLanding(){
        System.out.println("lading하고있습니다.");
    }
}
