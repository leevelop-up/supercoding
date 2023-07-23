package exercise.chapter_43;

public class GoldCustomer extends Customer {
    private double discountRatio;
    static{
        System.out.println("Gold Class");
    }
    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price*bonusPointRatio;
        price -= price*discountRatio;
        return price;
    }

    GoldCustomer(String name){
        super();
        this.customerID = "CUstomer"+ Customer.serialNums++;
        this.name = name;
        this.customerGrade = "Gold";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    public String toString() {
        return String.format("Customer(customerid=%s, name=%s, customerGrade=%s, bounusPoint =%d)\n",
                this.customerID,this.name,this.customerGrade,this.bonusPoint);
    }
}
