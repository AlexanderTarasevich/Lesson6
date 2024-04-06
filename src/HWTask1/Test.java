package HWTask1;

public class Test {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(155649855, 23.0);
        CreditCard card2 = new CreditCard(166555666, 200555.0);
        CreditCard card3 = new CreditCard(968642545, 500.0);


        card1.deposit(300.0);
        card2.deposit(500.0);


        card3.withdraw(100.0);


        System.out.println("Информация о карточках:");
        card1.printCardInfo();
        card2.printCardInfo();
        card3.printCardInfo();
    }
}



