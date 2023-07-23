package exercise.chapter_45;

public class Point <T extends Number,V extends  Number>{
    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public Double calculateDistance(){
        //클래스 명 부분extend number로 선언했기때문에 해당 if문은 필요 없다.
//        if(!(this.x instanceof Number)){
//            return null;
//        }
//        if(!(this.y instanceof Number)){
//            return null;
//        }
        Double num1 = ((Number) this.x).doubleValue();
        Double num2 = ((Number) this.y).doubleValue();
        return Math.sqrt(Math.pow(num1,2)+Math.pow(num2,2));
    }
}
