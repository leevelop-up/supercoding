package exercise.chapter_53;

import java.io.IOException;

public class DayTest {
    public static void main(String[] args){
        Day monday = Day.MONDAY;
        Day friday = Day.FRIDAY;
        System.out.println(monday);
        System.out.println(friday.getKoreanName());


        switch(monday){
            case MONDAY :
                System.out.println(monday.getKoreanName());
                break;
            case FRIDAY:
                System.out.println("힘들어");
            default:
                break;
        }


    }



}
