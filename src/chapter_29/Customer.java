package chapter_29;

public class Customer {

    private long cashAmount;
    private String myFeeling;

    //가격 물어본다.
    public void askCoffee(Cashier cashier,String  coffeeName){
        System.out.println("손님: 커피"+coffeeName+" 얼마인가요?");

    }
    //돈을 뺀다.
    public long withDrawCash(long amount){
        this.cashAmount -= amount;
        return amount;
    }

    //커피를 주문한다.
    public void orderCoffee(String coffeeName, boolean isWrappedUp){
        System.out.println("손님: 커피"+coffeeName+"을 주문할께요 단, 포장여부는"+isWrappedUp+"으로 부탁드려요");

    }
    //커피 마신다.
    public void drinkCoffe(Coffee coffee){
        String coffeeName = coffee.getCoffeName();
        System.out.println("손님: 나는 커피"+coffeeName+"을 마신다.");
    }
    public void upgreadeMyFeeling(){
        this.myFeeling = "기분이 좋아졌다.";
    }

    public void shoyMyInfo(){
        System.out.printf("손님: 나의 기분은 %s이고 현금은 %d",this.myFeeling,this.cashAmount);


    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
