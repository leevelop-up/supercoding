package exercise.chapter_37;

public class MaleTow extends FamilyMan implements FamilyRole,EmployeeRole{

    @Override
    public void workTogether(EmployeeRole employeeRole) {
        String name = employeeRole.getName();
        System.out.println(name+"인 직장 동료와 업무를 하고있습니다.");
    }


    @Override
    public String getName() {
        return this.name;
    }
}
