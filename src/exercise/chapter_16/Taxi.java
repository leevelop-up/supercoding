package exercise.chapter_16;

public class Taxi {

    public static void main(String[] args) {
        int goHomeTime = 3;
        int payment = 10000;
        String myHome = "서울";



        if(0< goHomeTime && goHomeTime < 4){
            payment = payment + (int)(payment*0.2);
        }

        if(myHome != "서울"){
            payment = payment +(int)(payment*0.2);
        }
        String result = String.format("내야할돈 %d",payment);
        System.out.println(result);
    }
}
