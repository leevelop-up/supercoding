package exercise.chapter_37;

public class Interface {
    public static void  main(String[] args){

        HusbandRole male = new Male("철수");
        Wife female = new Female("영희");

        male.sayLoveEveryDay();
        male.takeCareWife(female);


        DaddyRole maleDaddy = (DaddyRole) male;
        Baby baby = new Baby("정우성");
        maleDaddy.educateBaby(baby);
        maleDaddy.sayLoveEveryDay();

        EmployeeRole maleEmployee = (EmployeeRole) maleDaddy;
        EmployeeRole femaleEmployee = new Female("김채원");
        ((EmployeeRole) maleDaddy).workTogether(femaleEmployee);


    }
}
