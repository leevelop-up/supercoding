package exercise.chapter_26;

public class Student {

    String scoolName;
    int classYear;
    int classroomNumbers;
    int studentNumber;

    //
    String name;
    String gender;


    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.name;
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

}
