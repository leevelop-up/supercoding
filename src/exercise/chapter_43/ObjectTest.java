package exercise.chapter_43;

public class ObjectTest {
    public static void main(String[] args) {
        Customer customer = new Customer("동현");

        System.out.println(customer.toString());

        GoldCustomer goldCustomer = new GoldCustomer("채현");
        System.out.println(goldCustomer.toString());

        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("아이유");

        System.out.println(staff);
        System.out.println(vipCustomer);
    }

}
