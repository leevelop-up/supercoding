package exercise.chapter_56;

public class LambdaTest1 {
    public static void main(String[] args){
        MultipleNum multipleNum1 = (x) -> x*1;
        MultipleNum multipleNum2 = (i) -> i*2;
        MultipleNum multipleNum3 = (x) ->{return x*3;};
        MultipleNum multipleNum4 = (int myInt) -> {return myInt*4;};


        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(5));
        System.out.println(multipleNum3.calculate(5));
        System.out.println(multipleNum4.calculate(5));


        StringNum stringNum1 = (x,y)-> System.out.println(x);
        StringNum stringNum2 = (x,y) -> {
            for (int i=0; i<y;i++){
                System.out.println(x);
            }
        };
        StringNum stringNum3 = (x,y) ->{
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<y;i++){
                sb.append(x);
            }
            System.out.println(sb.toString());

        };
        stringNum1.printString("hello",5);
        stringNum2.printString("hello",5);
        stringNum3.printString("hello",5);

    }
}
