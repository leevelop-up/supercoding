package exercise.chapter_30;

class OOPStatic {
    public static void main(String[] args){
        int num = Student.getSerialNum();
        String city = Student.city;

        Student.setSerialNum(10);

        Student student1 = new Student("alice","Femail");
        Student student2 = new Student("mike","Femail");
        Student student3 =  new Student("tail","Femail");
        Student student4 = new Student("may","Femail");

        int num4 =student4.getSerialNum();
        System.out.println(num4);

        student1.pringMYinfo();
        student2.pringMYinfo();
        student3.pringMYinfo();
        student4.pringMYinfo();


    }
}



/*
=   static변수는 정적변수라고 한다.
     -> 프로그램 실행시, 정적생성됨, 인스턴스는 생성 전 정의 되어있음.
     ->클래스로 바로 호출 가능

    static class로 만들었을경우 인스턴스는 넣을수 없다.
    public static void setSerialNum(int num){
        serialNum = num;
        this.num = num --> 안됨.
    }

    private static int num => 클래스 변수
    private int num =>  인스턴스 변수
public static void setSerialNum(int num){
        serialNum = num;
        //메소드 안에서만 의미가 있는 변수를 로컬 변수라고 한다.(지역변수)
        //함수 내부에서만 사용
    }



 */
