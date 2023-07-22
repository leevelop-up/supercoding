package exercise.chapter_35;

public class Oopp {

    public static void main(String[] args){
       // Animal animal = new Animal();
        Animal animal1 = new Bird();
        Animal animal2 = new FIsh();
        Animal animal = new Person();
        Animal animal3 = new Dog();


        feed(animal,"빼빼로");
        feed(animal1,"벌레");
        feed(animal2,"모이");
        feed(animal3,"고기");



    }

    public static void feed(Animal animal, String food){
        animal.eat(food);
    }
}

/*

oop 다형성

업캐스팅
Animal animal = new Animal();
Animal animal1 = new Bird();
Animal animal2 = new FIsh();


feed(animal,"빼빼로");
feed(animal1,"벌레");
feed(animal2,"모이");

public static void feed(Animal animal, String food){
    animal.eat(food);
}
feed의 Animal은 생성된 각 animal,bird,fish의 객체의 값을 가져온다(Animal은 타입)



다운 캐스팅
- 업캐스팅의 반대작용
- 부모 클래스에서 자식 클래스로 형 변환(단, 인스턴스의 그대로 돌아 가야함.)
- 인스턴스 타입으로만 다운캐스팅 가능

-> instanceof를 사용 한다.
  - 인스턴스의 객채 타입을 확인하는 연산자
  - 형변환 가능 여부를 true/fasle로 반환
  - 객체 instanceof 클래스로 사용한다.

if(animal instanceof Bird){
    Bird bird = (Bird) animal;
    bird.fly();
}
 - 예시와 같이 Bird 객체를 입력하여 해당 값을 비교한후 true일 경우 bird객체의 메소드를 호출 한다.

final 키워드 사용


 */