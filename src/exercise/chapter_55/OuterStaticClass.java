package exercise.chapter_55;

//정적중첩 클래스
public class OuterStaticClass {
    private static int outerDate;


    public OuterStaticClass(int outerDate) {
        //this.outerDate = outerDate;
    }

    public static class InnerClass{
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println(outerDate); //innerclass가 static이기때문에 outerDate를 static으로 받아함 이유느 static은 class가 생성될때 만들어지고, outerdate는 인스턴스될때 만들어지기 때문
            System.out.println(innerData);
        }
    }




}
