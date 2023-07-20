package exercise.chapter_27;

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
    Student(String pName, String pGender){
        name = pName;
        gender = pGender;

    }

    Student(String pScoolName, int pClassyear, int pClassrommNum, int pStudentNum,String pName,String pgenter){
        scoolName = pScoolName;
        classYear = pClassyear;
        classroomNumbers = pClassrommNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pgenter;
    }

    public String getName(){
        return name;
    }

}
