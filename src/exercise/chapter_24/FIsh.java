package exercise.chapter_24;

public class FIsh {
    //속성
    String sex;
    boolean havingPoison;
    String StartSpawningDate;
    String endSpawningDate;
    String leavingSea;



    //행위
    void eat(String food){
        System.out.printf("나,무록기는%s를 먹고있습니다.",food);
    }
    void swim(int meter){
        System.out.println("나는 헤엄칩니다. 미터: "+ meter);
    }
    void makeCorwnd(FIsh otherfish){
        System.out.println("나는 다른 물고기와 무리 짓습니다.");

    }
    void sleep(){}
}
