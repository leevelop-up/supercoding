package exercise.chapter_92;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();


        ClassB classB = new ClassB();
        ClassA classA1 = new ClassA(classB);

        classA1.sayHello();

    }
}
