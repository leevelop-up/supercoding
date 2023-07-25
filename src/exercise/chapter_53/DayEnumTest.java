package exercise.chapter_53;

import java.util.Arrays;

public class DayEnumTest {
    public static void main(String[] args){
        //Ordinal,CompareTo,Values

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal"+monday.ordinal());
        System.out.println("ordinal"+sunday.ordinal());
        System.out.println("ordinal"+thursday.ordinal());


        System.out.println("CompareTO : "+monday.compareTo(sunday));
        System.out.println("CompareTO : "+monday.compareTo(thursday));

        Day[] days = Day.values();
        System.out.println(Arrays.toString(days));
    }
}
