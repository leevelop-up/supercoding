package exercise.chapter_33;

public class Animal {
    protected String gender;

    public void eat(String food){
        System.out.printf("동물이 %s를 먹습니다.",food);
    }

    public void sleep(){
        System.out.println("동물이 잠을 자고있습니다.");
    }
}
