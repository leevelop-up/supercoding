package exercise.chapter_51;

import exercise.chapter_51.exceptions.IDFOrmatExcepriont;
import exercise.chapter_51.exceptions.PositiveNumberException;

public class PTMember {
    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private  String gender;

    public PTMember(String name, Integer height, Integer weight, String gender) {

        if(height <=0){
            throw  new PositiveNumberException("키는 0이상이어야합니다.");
        }
        if(weight <=0){
            throw  new PositiveNumberException("몸무게는 0 초과여야 합니다.");
        }


        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public void setID(String ID) {
        if(ID == null) throw new IDFOrmatExcepriont("ID는 null이 될수없어");
        if(ID.length() <= 8 || ID.length() >=20) throw new IDFOrmatExcepriont("ID는 글자수 맞춰라 될수없어");

        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
