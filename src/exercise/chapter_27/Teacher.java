package exercise.chapter_27;

public class Teacher {
    //학교정보
    private String scoolName;
    private Subject subject;
    private String name;
    private String gender;


    void teach(Student student, String subjectName){
        String studentName = student.getName();

        System.out.printf("선생:%s학생에게 %s 과목을 가르치고 있습니다.",studentName,subjectName);
    }
    Teacher(){}
    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode){
        name = pName;
        gender = pGender;

        Subject newsubject = new Subject();
        newsubject.setSubjectCode(pSubjectCode);
        newsubject.setSubjectName(pSubjectName);

        subject = newsubject;

    }
    //getter
    public String getName(){
        return name;
    }

}
