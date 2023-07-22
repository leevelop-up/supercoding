package exercise.chapter_35;

public class AnimalDownCasting {

    public static void main(String[] args) {
        //

        Animal animal = new Bird();
        checkBirdAndFly(animal);
        //Animal animal1 = new Animal();
        //checkBirdAndFly(animal1);
        Animal animal2 = new Person();
        checkBirdAndFly(animal2);
    }

    static void checkBirdAndFly(Animal animal){
        if(animal instanceof Bird){
            //다운 캐스팅
            Bird bird = (Bird) animal;
            bird.fly();
        }else{
            System.out.println("너느 새가 아니야");
        }
    }
}
