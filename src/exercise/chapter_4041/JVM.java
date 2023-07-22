package exercise.chapter_4041;

public class JVM {
}

/*
    JVM의 원리

    1. Java의 compiler를 실행하면 class 파일이 만들어짐
    2. class loader가 사용하기 위해 호출한다.
    3. Class Loader(Loading,Linking,Initialization)을 작업한후
        - Loading : 클래스 파일을 가져와서 JVM의 메모리에 로드한다.(메소드 영역에 저장)
        - Linking : 클래스 파일을 사용하기 위해 검증하는 과정
        - Initialization : 클래스 변수들을 초기화 한다.
    4. JVM 실행 엔진
     - Java interpreter로 java언어를 통역하는 역할
     - JIT 컴파일러로 반복문장 메모(네이티브(머신)코드) : 인터프리터로 자주쓰는걸 메모하여 사용함
    5.JVM Runtime Data Area 영역에 저장
      - 스레드 영역(JVM stack), Heap 영역, Method Area영역(Runtime Constant Pool)
    6. Method Area영역은 클래스/메소드 코드, 정적 필드, 상수 풀 저쟝 영역
      - 메소드, 클래스의 속성, 모소드 상속 정보, 매개변수, 접근제어자, 클래스 변수 등
      - 상수, 문자열 Literal 저장(컴파일 때 만들어짐(1번 상황))
    7.Heap 영역은 런타임시, 동적으로 할당되는 영역으로 인스턴스와 배열 타입 등 저장
    8.JVM Stack 프로그램 실행중, 임시로 할당되고 소멸되는 정조 저장
      - 프레임이란 해당 메소드 만을 위한 공간, 메소드 종료되면 삭제, 매개 변수, 지역변수등 임시 저장


      -Xlog:class+init(클래스 로딩 확인하기)
      -XX:+PrintCompilation(실행 머신)
      - 사진내용: linkToStatic(LLLLLLLLLIIL)L (native)   (static) 이런건 몇번나와서 네이티브 코드로 저장해서 사용한다.
      - 상수풀 확인하는 방법
        -> 망치모양 눌러서 빌드
        -> 터미널에서 out폴더 하위에 실행할 클래스 폴더로 접근
        -> javap -v 폴터.클래스파일명 입력
        -> Constant pool: 내용으로 상수풀에 올라온 리터럴 변수, 상수 확인 가능




    자바의 기본형 : (논리형, 문자형, 정수형 실수형)
    자바의 참조형 : 기본형을 제외한 모두(클래스, 배열, 인터페이스, 열거타입(ENUM)
    기본형
     int n = 10
     long a = 1234
     있는 그대로 값 자체를 지칭

    참조형 생성
     - new 로 JVM Heap메모리 점유
       customer customer = new customer
       int[][] arr = new int[1][1]
     - 저장된 공간 주소를 지칭하게 된다.
        customer = 주소 200;
        arr = 주소 300;

     String 생성
     String s1 = "cat"; 은 String pool에저장
     String s2 = new String("cat")은 heap에 cat이 저장됨

     JVM 가비지 콜렉터(중요)

     가비지 컬렉션 대상 판별
     Reachable: 객체가 참조되어있는상태
     unReachable :객체가 참조되어있지 않는 상태
     가비지 컬렉션 청소방식
     mark -> sweep -> compaction
     unreachable상태 마킹 하고-> 해당 마킹상태 삭제 -> 참조된 상태를 순서대로 다시 모은다.

     두가지 종류의 청소
     - Minor GC
       : 새로운 객체들이 할당되는 영역(Young Generation)

     - Major GC
        : 오랫동안 살아남은 객체들이 존재하는 영역(old Generation)
        : stop-the-world 상태가 생김

      Java Gc 상용 방법
      - System.gc(); 를 이용하면 영역에서 삭제한다.(함부로 부르면 안됨. 아주 무거운 작업)
      - 자바에서 자동으로 수행됨으로 따로 작업 x



 */
