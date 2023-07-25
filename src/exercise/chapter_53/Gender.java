package exercise.chapter_53;

public enum Gender {
    FEMALE("Female","여자"),
    MALE("Male","남자"),
    UNKNOWN("unknown","미정");

    private String englishTerm;
    private  String KoreanTerm;

    Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        KoreanTerm = koreanTerm;
    }

    public static Gender valueOfTerm(String str){
        for(Gender gender:values()){
            if(str.equals(gender.englishTerm) || str.equals(gender.KoreanTerm)){
                return gender;
            }
        }
        return Gender.UNKNOWN;
    }
}
