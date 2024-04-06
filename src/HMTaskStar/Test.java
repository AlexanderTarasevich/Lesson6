package HMTaskStar;

public class Test {
    public static void main(String[] args) {
        ATM atm = new ATM(5, 8, 7);

        atm.printATMInfo();
        atm.addMoney(5, 5, 5);
        atm.printATMInfo();
        atm.withdrawMoney(250);


    }
}
