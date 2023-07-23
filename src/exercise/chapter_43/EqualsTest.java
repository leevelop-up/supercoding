package exercise.chapter_43;

public class EqualsTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ID1","동현");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("ID1","동현");

        Customer customer4 = new Customer("id1","철민");

        System.out.println(customer1);
        System.out.println(customer3);
        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3)); // 오버라이드 하여 다시 조건 재정의
        System.out.println(customer1 == customer3); //기존에 있던 메모리 오버라이드로 변형된게 아니라 기본 값을 비교

    }
}
