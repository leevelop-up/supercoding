package exercise.chapter_32.fish;

public class FishChild extends Fish {

    private boolean eatable;
    protected String leavingSeaChild;

    //새로운 메소드
    public void digging(){
        System.out.println(myInfo()+"가 모래를 파고있습니다.");
    }
    public boolean isEatable(){
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger(){
        this.havingPoison = true;
    }
    @Override
    void eat(String food){
        System.out.println(myInfo()+"는%s를 아주 열심히 먹고있습니다\n"+food);

    }

    void printSea(){
        System.out.println(myInfo()+"는"+this.leavingSeaChild+"바다 출신, 부모 물고기는 "+super.leavingSea+"출신이야ㅣ");
    }

    @Override
    String myInfo() {
        return super.myInfo()+"는 부모 물고기,"+String.format("자식 물고기(eatable=%b, leavingSea=%s",this.eatable,this.leavingSeaChild);
    }

    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }

    FishChild(){
        //super();를 호출하고 있어서 부모fish()함수가 실행됨.
        System.out.println("자식 물고기가 생성되었습니다.");
    }

    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        super.leavingSea = leavingSea;
    }

    public FishChild(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea, boolean eatable, String leavingSea1) {
        super(sex, havingPoison, startSpawningDate, endSpawningDate, leavingSea);
        this.eatable = eatable;
        this.leavingSea = leavingSea1;
    }

    FishChild(String sex, boolean eatable, String leavingSea){
        super(sex,false,"2002","2002",leavingSea);
        this.eatable = eatable;
    }


}
