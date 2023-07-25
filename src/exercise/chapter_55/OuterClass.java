package exercise.chapter_55;

public class OuterClass {
    private int outerData;


    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass{
        private int InnerData;

        public InnerClass(int innerData) {
            InnerData = innerData;
        }

        void  display(){
            System.out.println(outerData);
            System.out.println(InnerData);
        }
    }
}

/*

항상 상속을 써야 하나?
클래스 하위 클래스를 정의 하여 영역을 그룹화 할수 있다.

일반 중첩 클래스는 외부 클래스 인스턴스와 연관
정적 중첩 클래스는 외부 클래스 인스턴으와 독립적

//
지역 내부 클래스, 익명 내부클래스

한번 사용하는데 새로 클래스를 정의 해야하나?

클래스정의 x메소드 내부에 정의 또는 익명 하면 된다.

지역내부 클래스는 메서드 내부접근 가능하고 여러번 인스턴스화 가능
익명 내부클래스는 한번만 인스턴스화 가능(더 많이 사용한다.)





 */
