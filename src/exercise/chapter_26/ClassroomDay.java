package exercise.chapter_26;

public class ClassroomDay {
    public static void main(String[] args){

        Student student1 = new Student("school",1,3,20,"Bob","Male");
        Student student2 = new Student("school",1,3,16,"Alice","Female");
        Student student3 = new Student("school",1,3,16,"Tyayer","Female");
        Student student4 = new Student("school",1,3,16,"ruu","Female");


        Teacher teacher = new Teacher("Tom","Female","korean","a001");

        String subjectName = "국어";
        teacher.teach(student1,subjectName);
        student1.study(teacher,subjectName);

    }
}
