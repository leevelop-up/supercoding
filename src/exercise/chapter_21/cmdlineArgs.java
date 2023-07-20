package exercise.chapter_21;

public class cmdlineArgs {

    public static void main(String[] args){
        System.out.println(args.length);
        System.out.printf("첫번째인자 : %s\n",args[0]);
        System.out.printf("두번째인자 : %s\n",args[1]);
    }
}
