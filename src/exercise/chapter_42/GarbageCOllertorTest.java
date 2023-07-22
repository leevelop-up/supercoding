package exercise.chapter_42;

import exercise.chapter_4041.Customer;

public class GarbageCOllertorTest {

    static Customer[] customers = new Customer[100];
    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<100; i++){
            Customer customer = new Customer("민철");
            customers[i] = customer;

        }
        System.gc();
        for(Customer customer: customers){
            customer.printMyinfo();

        }
        while (true){
            Thread.sleep(100);
        }
    }
}
