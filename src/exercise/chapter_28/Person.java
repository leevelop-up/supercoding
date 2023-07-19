package exercise.chapter_28;

public class Person {

    private String name;
    private String genter;
    private int age;

    public  void showMyself(){
        System.out.printf("Person 인스턴스: name: %s, gender:%s, age:%d",this.name,this.genter,this.age);
    }
    public Person(String name){
        this(name,"unknown");
    }
    public Person(String name, String gender){
        this(name,gender,-1);
    }
    public Person(String name, String genter, int age) {
        this.name = name;
        this.genter = genter;
        this.age = age;
    }

    public Person returnMySelf(){
      return this;
    }
}
