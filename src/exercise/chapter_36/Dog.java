package exercise.chapter_36;

import exercise.chapter_35.Animal;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        System.out.println("개는"+food+"을 물어 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("개가 잠을 잡니다.");
    }
}
