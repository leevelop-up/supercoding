package exercise.chapter_34;

public class Customer {
    static int serialNums = 1;
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
    Customer(String name){
        this.customerID = "customer"+serialNums++;
        this.name = name;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
    }
    void printMyinfo(){
        System.out.printf("Customer(customerid=%s, name=%s, customerGrade=%s, bounusPoint =%d)\n",
                this.customerID,this.name,this.customerGrade,this.bonusPoint);
    }


}
