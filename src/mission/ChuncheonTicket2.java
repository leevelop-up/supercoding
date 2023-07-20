package mission;

public class ChuncheonTicket2 {

    public static void main(String[] args){
        int fullTicket = 625;
        int personGetTicket = 3;

        System.out.println(fullTicket/personGetTicket);
        System.out.println(fullTicket%personGetTicket);

        int AliceAge = 70;
        String AliceCountry = "미국";
        int KimAge = 70;
        String KimCountry = "한국";
        int YooAge = 70;
        String YooCountry = "미국";
        System.out.println(target(AliceAge,AliceCountry));
        System.out.println(target(KimAge,KimCountry));
        System.out.println(target(YooAge,YooCountry));



    }

    private static boolean target(int age, String country) {
        final int SENIOR_AGE_STANDARD = 65;
        final String SENIOR_COUNTRY_STANDARD = "한국";
        return (age >=SENIOR_AGE_STANDARD && country == SENIOR_COUNTRY_STANDARD);

    }
}
