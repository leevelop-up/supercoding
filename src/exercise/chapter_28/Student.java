package exercise.chapter_28;

public class Student {

    private String scoolName;
    private int classYear;
    private int classroomNumbers;
    private int studentNumber;

    //
    private String name;
    private String gender;


    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("핵상: 저는 %s 선생님에서%s 과먹을 배웁니다.",teacherName,subjectName);

    }

    Student(){

    }
    Student(String name, String gender){
      this("School",1,3,-1,"bob","male");

    }

    Student(String scoolName, int classyear, int classrommNum, int studentNum,String name,String genter){
        this.scoolName = scoolName;
        this.classYear = classyear;
        this.classroomNumbers = classrommNum;
        this.studentNumber = studentNum;
        this.name = name;
        this.gender = genter;
    }

    public String getName(){
        return name;
    }

}
