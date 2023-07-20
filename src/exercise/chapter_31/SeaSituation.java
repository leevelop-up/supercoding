package exercise.chapter_31;

public class SeaSituation {
    public static void main(String[] args){
        Fish fish1 = new Fish();
        fish1.setSex("male");
        fish1.setLeavingSea("east");
        fish1.setHavingPoison(false);

        FishChild fishChild = new FishChild();
        fishChild.setSex("female");
        fishChild.setLeavingSea("west");
        fishChild.setHavingPoison(true);

        System.out.println("독성여부:"+fishChild.isHavingPoison());
        fish1.eat("새우");
        fishChild.eat("새우");
        //
//
//        fish1.printfMyinfo();
//        fishChild.printfMyinfo();
//
//        fishChild.digging();
//        fishChild.setEatable(true);
//        System.out.println(fishChild.isEatable());


    }
}
