package exercise.chapter_58;

import java.io.Serializable;

public class Person implements Serializable {

    private  static final long serialVersionUid = 1L;
    private String name;
    private String genter;
    private transient int age;

    private  String country;
    private String occupation;

    public  void showMyself(){
        System.out.printf("Person 인스턴스: name: %s, gender:%s, age:%d",this.name,this.genter,this.age);
    }
    public Person(String name){
        this(name,"unknown");
    }
    public Person(String name, String gender){
        this(name,gender,-1,"korea",null);
    }

    public Person(String name, String genter, int age, String country, String occupation) {
        this.name = name;
        this.genter = genter;
        this.age = age;
        this.country = country;
        this.occupation = occupation;
    }

    public Person returnMySelf(){
      return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", genter='" + genter + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
