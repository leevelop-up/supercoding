package exercise.chapter_32.fish;


public class Super {
    public static void main(String[] args){

//        FishChild fishChild = new FishChild();
//        fishChild.setSex("female");
//        fishChild.setLeavingSea("west");
//        fishChild.setHavingPoison(true);
//
//        fishChild.printfMyinfo();
//
//        FishChild fishChild1 = new FishChild("female",true,"west");
//        fishChild1.printfMyinfo();

//            FishChild fishChild = new FishChild();
//            fishChild.setLeavingSea("동해");
//            fishChild.setLeavingSeaChild("서해");
//            fishChild.printSea();

        //타입선언: 부모, 인스턴스화: 자식
        //타입선언: 부모, 인스턴스화 :부모
        //타입서언: 자식, 인스턴스화 : 자식
        //타입선언:자식, 인스턴스화 : 부모 => 묵시적 변환 안된다.( FishChild fishChild2 = new Fish();)
        Fish fish1 = new Fish();
        fish1.eat("새우");
        Fish fish2 = new FishChild();
        fish2.eat("새우");
        FishChild fishChild1 = new FishChild();
        fishChild1.eat("새우");




    }

}
/*


super 사용법
 - super를 활용하여 부모 객체의 속성/생성자를 호출 할수 있다.
 - 자식 필드로 인해 shadowing을 주의 해야한다.


shadowing

    public FishChild(boolean eatable, String leavingSea) {
        this.eatable = eatable;
        this.leavingSea = leavingSea;
    }

    부모 leavingSea
    자식 leavingSea 의 값이 갖고 FishChild의 leavingSea를 this.로 받았을때 해당 값의 print는 부모클래스의 함수안에서 this.leavingSead로 넘겨받기 때문에 빈값으로 노출
묵시적 형 변화
 기본 타입의 묵시적 변환시
 int a = 10;
 long longa = a;
 로 더 큰타입으로 변환이 가능하다.
 하지만 묵시적 클래스의 경우 자식클래스가 정의한 값을 부모가 사용할수 없다.(자식에 추가가 가능하여 자식이 할 수있는게 많다.)


 */