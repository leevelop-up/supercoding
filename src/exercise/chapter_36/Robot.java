package exercise.chapter_36;

public class Robot implements Walkable{
    private String robotID;
    private String modelName;
    private String color;

    @Override
    public void walk() {
        System.out.println("로봇id"+robotID+"걷고있습니다.");
    }

    public void helpPerson(Person person){
        String name = person.getName();
        System.out.println("로봇이 인간"+name+"을 돕습니다.");
    }

    public Robot(String robotID) {
        this.robotID = robotID;
    }
}
