package exercise.chapter_58;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

    private final long serialver = 1L;
    static int serialNums = 1;
    static{
        System.out.println("Customer Class");
    }
    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusPointRatio;

    public int calculatePrice(int price){
        this.bonusPoint += price*bonusPointRatio;
        return price;
    }
    Customer(){}
    public Customer(String customerID, String name) {
        this(name); //밑에 Customer(의 name)을 가져온다.
        this.customerID = customerID;
    }
    public Customer(String name){
        this.customerID = "customer"+serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
    }
    public void printMyinfo(){
        System.out.printf("Customer(customerid=%s, name=%s, customerGrade=%s, bounusPoint =%d)\n",
                this.customerID,this.name,this.customerGrade,this.bonusPoint);
    }



    @Override
    public String toString() {
        return String.format("Customer(customerid=%s, name=%s, customerGrade=%s, bounusPoint =%d)\n",
                this.customerID,this.name,this.customerGrade,this.bonusPoint);
    }

    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Customer){
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.customerGrade);
    }
}
