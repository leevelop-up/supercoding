package exercise.chapter_29;

public class CoffeeChopSituation {
    public static void main(String[] agrg){
        //미리 인스턴스화
        Customer customer = new Customer();
        customer.setCashAmount(50_000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        //로직 시작
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;
        customer.askCoffee(cashier,coffeeName);

        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName,price);

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName,isTakeOut);

        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500,500);
        barista.sayCoffeeReady(coffee);

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);

        customer.drinkCoffe(coffeeCompleted);
        if(coffeeCompleted.getCoffeName() == coffeeName && coffeeCompleted.isWrappedUp() == isTakeOut){
            customer.upgreadeMyFeeling();
        }

        customer.shoyMyInfo();




    }
}
