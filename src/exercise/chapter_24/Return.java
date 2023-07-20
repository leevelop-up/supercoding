package exercise.chapter_24;

public class Return {

    //일반적인 입력값, 출력값도 있는경우
    //둘다 하나인 경우


    static int toUnicode(char ch){
        return (int) ch;
    }

    //파라미터 여러개
    static int sumAndMultiplyFour(int a, int b){
        return (a+b)*4;
    }


    public static void main(String[] arg){
        char ch= 'a';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int a = 10;
        int b = 5;
        int result = sumAndMultiplyFour(a,b);
        System.out.println(result);
        String res = sayHello();
        System.out.println(res);


    }

    //
    static String sayHello(){
        return "hello";
    }

     static void printHello(String str){
         System.out.println(str);
     }

     static void printHi(){
         System.out.println("hihi");
     }
}



/*


함수
리턴값이 없을때는
void로 작성
public static void 함수명(){
}

이름 짓기 규약
HelloMyWorld; 파스칼 케이스(클래스 이름)
helloMyWorld; 카멜 케이스(인스턴스 변수, 메소드이름)
hello_my_world; 스네이크 케이스(사용x)
HEELO_MY_WORD;스크리밍 스네이크 케이스(상수)
hello-my-world; 케바케이스(자바에서 안됨!)


자바 인스턴스

public class Player{
    String name;
    String color;
}


{클래스형}{변수 이름} = new {생성자};
Player payer1 = new Player();

디폴트 생성자
Student student1 = new Student();

Student(); 이부분이 디폴트 생성자
=> 클래스이름+();
기본적으로 생성

생성자 오버로드
반복되는 초기화 구문 방지
Student(){} 기본생성자는 적어주고 시작
Student(String pScoolName, int pClassyear, int pClassrommNum, int pStudentNum,String pName,String pgenter){
    scoolName = pScoolName;
    classYear = pClassyear;
    classroomNumbers = pClassrommNum;
    studentNumber = pStudentNum;
    name = pName;
    gender = pgenter;
}

Student student2 =  new Student("Scool",1,3,15,"Alice","Female");


실행 클래스
public static void main(String[] args){}
=> 메인 메소드가 있는 메소드
=> 로직 실행 가능한 실행 클래스

일반 클래스
public class Student{}
=> 메인 메소드가 없는 클래스
=> 객체가 설계된 일반 클래스


클래스 정보 은닉
 정보 은닉화가 중요한 이유
  - 코드 보완성 증가
  - 코드 유지보수성 증가
  - 캡슐화 실천


 접근 제어자
 public > protected > default > private

 필드 접근 제어자 메소드
 getter, setter
 private로 필드를 선언하면
 public 타입 getname(){
    return name
 }
 과 같이 public타입의 함수를 타도록 변경(허락하고 받아갈수 있도록)

 this 사용법
    클래스 자체 맴버값x, 인스턴스의 멤버값o
    1.인스턴스 멤버 지칭
    2. 생성자 호출
    3.메모리 주소 반환(this는 인스턴스 자신의 생성주소를 알려준다.)
    -heap 메모리저 저장이된다.(Person person1 = new Person("강철중");)


*/
