package exercise.chapter_34;

public class Test {

    public static void main(String[] args){
        //전체 상황

        Customer customer = new Customer("철수");
        VIPCustomer vipCustomer = new VIPCustomer("영희");
        Staff staff = new Staff();
//        customer.printMyinfo();
//        vipCustomer.printMyinfo();
//        customer1.printMyinfo();
        int price = staff.helpPayment(customer,1000000);
        staff.addSalesAmount(price);
        staff.printMySalesAmount();

    }

}
