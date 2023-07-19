package exercise.chapter_27.pacakgeOne;

public class ClassAA {

    void testPublic(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();

    }

    void testPrivate(ClassA classA){
       // String str = classA.privateStr;
        //classA.methodPrivate();
    }

    public void testDefault(ClassA classA){
        String str = classA.defaultstr;
        classA.methodDefault();
    }



}
