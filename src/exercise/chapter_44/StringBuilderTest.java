package exercise.chapter_44;

public class StringBuilderTest {
    public static void main(String[] args) {

        String str = "";
        long startTime = System.currentTimeMillis();
        for(int i=0; i<50000; i++){
            str += "cat";
        }

        long endTime = System.currentTimeMillis();
        System.out.println("str : "+(endTime-startTime)+"ms");

        long startTime1= System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<50000; i++){
            sb.append("cat");
        }
        String output = sb.toString();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Stringbuilder :" +(endTime1-startTime1)+"ms");
    }

}
