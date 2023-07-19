package exercise.chapter_30;

import exercise.chapter_28.Teacher;

public class Student {
    private static int serialNum = 1;
    static String city = "seoul";
    private String scoolName;
    private int classYear;
    private int classroomNumbers;
    private int studentNumber;

    private int studentID; //고유아이디

    private String name;
    private String gender;

    //정적 메소드
    public static int getSerialNum(){
        return serialNum;
    }
    public static void setSerialNum(int num){
        serialNum = num;

    }


    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("핵상: 저는 %s 선생님에서%s 과먹을 배웁니다.",teacherName,subjectName);

    }
    public void pringMYinfo(){
        System.out.printf("scoolname:%s, clasYear:%s,roomnumber%d,studentnumber%d,studentID%d,name:%s,gender%s\n",
                this.scoolName,this.classYear,this.classroomNumbers,this.studentNumber,this.studentID,this.name,this.gender
                );
    }
    Student(){

    }
    Student(String name, String gender){
      this("School",1,3,-1,"bob","male");

    }

    Student(String scoolName, int classyear, int classrommNum, int studentNum, String name, String genter){
        this.studentID = serialNum++;
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
