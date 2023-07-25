package exercise.chapter_55;

public class LocalTest {
    public static void main(String[] args){
        class LocalWalk implements Walkable{

            @Override
            public void walk() {
                System.out.println("walk");
            }
        }
        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i=100;



        //익명 클래스
        Walkable anonymousWalk = new Walkable() {
            @Override
            public void walk() {
                System.out.println(i);
                System.out.println("익명 walk");
            }
        };
        anonymousWalk.walk();
    }

    public static void test(){

    }
}
