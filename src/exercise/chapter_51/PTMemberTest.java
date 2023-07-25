package exercise.chapter_51;

public class PTMemberTest {
    public static void main(String[] args){
        PTMember ptMember = new PTMember("민철",178,70,"male");
        ptMember.setID("asdf");
        System.out.println(ptMember.toString());

    }
}
