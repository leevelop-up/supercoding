package exercise.chapter_24;

public class Scores {
    public static void main(String[] args){
        int aClass1 = 50;
        int aClass2 = 30;
        int aClass3 = 45;

        int bClass1 = 60;
        int bClass2 = 65;
        int bClass3 = 66;

        double avgAclass = calculateAvg(aClass1,aClass2,aClass3);
        double avgBclass = calculateAvg(bClass1,bClass2,bClass3);

        System.out.printf("A 학급 점수 %.2f, B 학급 점수 %.2f",avgAclass,avgBclass);
    }

    static double calculateAvg(int student1, int student2, int student3){
        int sumBclass = student1+student2+student3;
        return sumBclass / (double) 3;
    }
}
