package exercise.chapter_31;

public class Fish {
    //속성
    //
    private String sex;
    protected boolean havingPoison;
    private String StartSpawningDate;
    private String endSpawningDate;
    String leavingSea;



    //행위
    void eat(String food){
        System.out.printf(myInfo()+"는%s를 먹고있습니다.",food);
    }
    void swim(int meter){
        System.out.println("나는 헤엄칩니다. 미터: "+ meter);
    }
    void makeCorwnd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리 짓습니다.");

    }
    void sleep(){}

    String myInfo(){
        return String.format("물고기(sex=%s, havingPosition=%b, leavingSea=%s)",
                this.sex,this.havingPoison,this.leavingSea
                );
    }

    void printfMyinfo(){
        System.out.println(myInfo());
    }

    public boolean isHavingPoison() {
        return havingPoison;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }

    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    Fish(){
        System.out.println("부모 물고기가 헤엄치고있습니다.");
    }
}
