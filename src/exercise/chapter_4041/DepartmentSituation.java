package exercise.chapter_4041;

public class DepartmentSituation {
    public static void main(String[] args) throws InterruptedException {
        //전체 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        String a = "heelo";
        String a1 = new String("Hello");
        String a2 = new String("Hello");
        String a3 = new String("Hello");
        String a4 = new String("Hello");


        //단골손님
        Customer customer = new VIPCustomer("아이유");

        Customer customer1 = new Customer("권율");
        Customer customer2 = new Customer("이순신");
        Customer customer3 = new VIPCustomer("광해군");
        Customer customer4 = new VIPCustomer("김좌진");
        Customer customer5 = new VIPCustomer("김혜수");
        Customer customer6 = new GoldCustomer("손흥민");


        Customer[] customerQueue = {
                new GoldCustomer("정우성")
        };


        for(Customer customerEach:customerQueue){
            customerEach.printMyinfo();
            int cash = staff.helpPayment(customerEach,price);
            System.out.println("내가 갠 금액은"+cash);
            staff.addSalesAmount(cash);
        }
        staff.printMySalesAmount();

        while(true){
            Thread.sleep(100);
        }
    }
}
