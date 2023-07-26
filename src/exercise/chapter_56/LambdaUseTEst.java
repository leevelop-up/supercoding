package exercise.chapter_56;

public class LambdaUseTEst {
    public static void main(String[] args){
        MultipleNum multipleNum = (num ) ->num *10;
//        printNUm(multipleNum);
//        printNUm((x)->x*100);

        GenericLambda<String> genericLambda = (str)->str.toUpperCase();
        GenericLambda<Integer> genericLambda1 = (num)->num*2;
        GenericLambda<Boolean> genericLambda2 = (myBool) -> myBool&true;

        System.out.println(genericLambda.calculate("asdf"));
        System.out.println(genericLambda1.calculate(100));
        System.out.println(genericLambda2.calculate(true));


    }

    static void printNUm(MultipleNum multipleNum){
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }


}
