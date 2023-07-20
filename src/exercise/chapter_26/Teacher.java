package exercise.chapter_26;

public class Teacher {
    //학교정보
    String scoolName;
    Subject subject;

    String name;
    String gender;


    void teach(Student student, String subjectName){
        String studentName = student.name;

        System.out.printf("선생:%s학생에게 %s 과목을 가르치고 있습니다.",studentName,subjectName);
    }
    Teacher(){}
    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode){
        name = pName;
        gender = pGender;

        Subject newsubject = new Subject();
        newsubject.subjectCode = pSubjectCode;
        newsubject.subjectName = pSubjectName;

        subject = newsubject;

    }
}
