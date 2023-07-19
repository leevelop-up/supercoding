package chapter_29;

public class Barista {
    //속성

    //행위
    public void noticeOrder(String coffeName){
        System.out.println("바리스타: 커피주문 확인 했습니다. 커피는 : "+coffeName);
    }
    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        Coffee coffee = new Coffee(coffeeName,waterQuantity,coffeeBeanQuantity);
        return coffee;
    }
    public void sayCoffeeReady(Coffee coffee){
        String coffeName = coffee.getCoffeName();
        System.out.println("바리스타:커피제작이 완료되었습니다. 커피:"+coffeName);
    }
    //생성자
}
