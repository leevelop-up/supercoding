package exercise.chapter_36;

import exercise.chapter_35.Animal;

public class Bird extends Animal implements Flyable{

    private long weight;
    private String color;

    @Override
    public void eat(String food) {
        System.out.printf("새가 %s을 부로리 쪼아 먹습니다.\n",food);
    }

    @Override
    public void sleep() {
        System.out.println("새가 잠을 자고있습니다.");
    }
    @Override
    public void fly(){
        System.out.println("새가 날고있습니다.");
    }


}
