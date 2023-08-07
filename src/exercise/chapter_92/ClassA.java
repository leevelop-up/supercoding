package exercise.chapter_92;

public class ClassA {
    private ClassB classB;

    public ClassA(){

    }
    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public void sayHello(){
        String message = classB.sayHello()+"난 에이야";
        System.out.println(message);
    }
}
