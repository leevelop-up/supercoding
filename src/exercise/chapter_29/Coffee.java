package exercise.chapter_29;

public class Coffee {

    private String coffeName;
    private long waterQuantity; //물 ml단위
    private long coffeeBeanQuantity; //coffe양 g단위
    private  boolean isWrappedUp; //포장 여부

    //행위
    void  beWrappedUp(){
        //해당 함수 사용시 포장이 된다는 뜻true로 변경
        this.isWrappedUp = true;
    }

    //생성자
    Coffee(String coffeName, long waterQuantity, long coffeeBeanQuantity){
        this.coffeName = coffeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        this.isWrappedUp = false;

    }

    //
    public String getCoffeName() {
        return coffeName;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }
}
