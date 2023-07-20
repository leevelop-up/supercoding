package exercise.chapter_29;

public class Cashier {
    //속성
    private long salesAmount;

    //행위
    public long checkCoffeePrice(String coffeeName){
        long price;
        switch (coffeeName){
            case "아메리카노":
                price = 5000;
                break;
            case "카페라테":
                price = 6000;
                break;
            case "카페모카" :
                price = 6500;
                break;
            case "카푸치노" :
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price){
        if(price == 0){
            System.out.println("캐시어: 죄송합니다 손님 말씀하신 메뉴 : "+coffeeName+"는 저희 가게에 없습니다.");
        }
        System.out.println("캐시어: 말씀하신 커페"+coffeeName+"의 가격이 "+price+"입니다.");
    }
    public void addAmount(long money){
        this.salesAmount += money;
    }
    public void sayOrder(String coffeeName){
        System.out.println("캐시어:커피"+coffeeName+"주문이 들어왔습니다.");
    }
    public Coffee wrapUpCoffee(Coffee coffee){
        coffee.beWrappedUp();
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeName();
        System.out.println("캐시어: 주문하신 커피"+coffeeName+"가 나왔스빈다.");
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }
}
