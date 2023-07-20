package exercise.chapter_27.pacakgeOne;

public class ClassA {
    public String publicStr;

    private String privateStr;
    String defaultstr;


    public void methodPublic(){}
    private void methodPrivate(){}

    void methodDefault(){};
    void testPrivate(){
        String str = privateStr;
        methodPrivate();
    }
}
