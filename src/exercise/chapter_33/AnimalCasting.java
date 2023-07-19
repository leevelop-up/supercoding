package exercise.chapter_33;

import exercise.chapter_32.fish.Fish;

public class AnimalCasting {
    public static void main(String[] args){
        Animal[] animals= {
                new Animal(),new Person(), new Person(), new FIsh(), new Bird(),
                new Person(), new FIsh(), new FIsh(), new Bird(), new Bird()
        };

        sleepTogether(animals);

        doSomethigSeparately(animals);

    }

    static void sleepTogether(Animal[] animals){
        for(Animal animal:animals){
            animal.sleep();
        }
    }

    static void doSomethigSeparately(Animal[] animals){
        for(Animal animal: animals){
            if(animal instanceof Bird){
                Bird bird = (Bird) animal;
                bird.fly();
            }else if(animal instanceof FIsh){
                FIsh fish = (FIsh) animal;
                fish.swim();
            }else if(animal instanceof Person){
                Person person = (Person) animal;
                person.walk();

            }else{
                System.out.println("동물 클래스이거나 지원하지 않는 객체입니다.");
            }



        }
    }
}
