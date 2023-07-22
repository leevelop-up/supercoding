package exercise.chapter_36;

public class Interface2 {
    public static void  main(String[] args){
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("asdf1");

        drone.fly();
        airplane.fly();

        if(drone instanceof Drone){
            Drone drone1 = (Drone) drone;
            drone1.takePicture();
        }
    }
}
