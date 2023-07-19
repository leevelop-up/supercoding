public class Main {
    public static void main(String[] args) {
        //
        System.out.println("Hello world!");
    }
}



/*
    자바는 박스로 생각
    int라는 박스의 이름을age라정하고 안에 내용은 10이다

    //변수 선언 및 초기화
    int age = 10;

    //변수 선언 후 값 대입하기
    int age;
    age = 10;

    type
    int 정수
    double 소수점
    boolean 참거짓
    char 'A' 하나의 문자열
    String "문자열" 한개이상의 문자열

    int a = 10
    double a = 3.14;
    boolean a = true;
    char a = 'a';
    String a = "asdf";

    변수 이름 정하기
    기본 제약사항 :
    1. 영문자, 숫자 특수문자 ($,_) 사용가능
    2. 숫자로 시작할 수 없음.
    3. 자바 예약어 사용금지(for,while 등)

    네이밍 권장사항
    1. 실제 의미를 담은 변수명( asdf(x) name(o))
    2. 소문자로 시작, 대문자로 띄워쓰기(myName,goodDay) 카멜 표기법

    연산자
    1. 단항 연산자 항이 하나인 연산자 ++num
    2. 이항 연산자 항이 두개인 연산자 num1+num2;
    3. 삼항 연산자 항이 세개인 연산자 (num>1) ? 0 : 1;


    변수의 사이즈
    1바이트 = 8비트
    정수형 byte(1바이트), short(2바이트), int(4바이트) long(8바이트)

    //정수부분이 1작은 이유는 8비트가 나타낼수있는 정수범위중 가장앞자리는 빼는데 +는 맨앞에 0으로 - 는 1로 되어있기 때문
    //바이트 범위 : -128 ~ 127
    //short 범위 : -32768 ~ 32767

    강제 캐스팅(명시적 형 변환)
    float myFloat = 10.4f;
    int myInt = (int)myFloat;

    Java 문자형, 인코딩/디코딩
    인코딩 : 문자-> 특정 코드값( =숫자)
    디코딩 : 특정 코드값(=숫자) -> 문자

    문자 부호체계
    아스키코드 : 8bit, 128개
    유니코드:16bit,65536개

    특수문자 출력
    \t 탭, \n 줄바꿈, \' 작은따움표
    \" 큰따움표, \\역슬래쉬
    !@#$% 특수문자

    상수와 리터럴
    상수: 변할 수 없는 수(리터럴,심볼릭 상수)
    symbolic 상수는 대문자 +"_" 조합으로 선언한다.
    final in my_num = 100;
    my_num =400 (x) 바꿀수 없음

    리터럴 : 우항의 값 = 데이터 그 자체 = 리터럴
    int year = 2023; 2023(우항)은 리터럴,year은 변수
    final int YEAR = 2023; 2023(우항)리터럴, YEAR은 상수
 */