package exercise.chapter_34;

public class DepartmentSituation {
    public static void main(String[] args){
        //전체 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);
        //단골손님
        Customer customer = new VIPCustomer("아이유");
        Customer[] customerQueue = {
                new Customer("권율"),new Customer("이순신"),new VIPCustomer("광해군")
                ,customer,new Customer("김좌진"),customer
                ,new Customer("장원영"),customer,new VIPCustomer("김혜수")
                ,new GoldCustomer("이동현"),new GoldCustomer("손흥민"),new GoldCustomer("정우성")
        };


        for(Customer customerEach:customerQueue){
            customerEach.printMyinfo();
            int cash = staff.helpPayment(customerEach,price);
            System.out.println("내가 갠 금액은"+cash);
            staff.addSalesAmount(cash);
        }
        staff.printMySalesAmount();
    }
}
