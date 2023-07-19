package exercise.chapter_34;

public class VIPCustomer extends Customer{
    static int serialnum = 1;


    private String agentID;
    private double discountRatio;

    @Override
    public int calculatePrice(int price){
        this.bonusPoint += price*bonusPointRatio;
        price -= price*discountRatio;
        return price;
    }
    public void callAgent(){
        System.out.println("담당직원"+this.agentID+"님 문의 드릴게 있어요~");
    }

    VIPCustomer(String name){
        super();
        this.customerID = "VIP"+serialnum++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio=0.1;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
    @Override
    void printMyinfo(){
        System.out.print("VIP");
        super.printMyinfo();
    }
}
