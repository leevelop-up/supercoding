package exercise.chapter_37;

public abstract class FamilyMan implements FamilyRole{
    protected String name;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name+"를 가르치고 있다.");

    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name+"인 아내를 케어 합니다.");
    }



}
