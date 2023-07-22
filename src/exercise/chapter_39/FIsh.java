package exercise.chapter_39;

public class FIsh extends Animal {
    private boolean havingPoison;
    private String livingSea;


    @Override
    public void eat(String food) {
        System.out.printf("물고니가 %s을 주둥이로 먹습니다.\n",food);
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 잠을 자고있습니다.");
    }

    public void swim(){
        System.out.println("물고기가 헤엄을 치고있습니다.");
    }
}
