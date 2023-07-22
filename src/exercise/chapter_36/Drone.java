package exercise.chapter_36;

public class Drone implements Flyable{
    private String droneId;
    private long remainingFuelAmount;
    private long remainingFileSorage;

    public void takePicture(){
        Flyable.printLanding();
        System.out.println("드론이 사진을 찍고있습니다.");
    }

}
