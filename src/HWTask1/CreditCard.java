package HWTask1;

public class CreditCard {
    int accountNumber;
    double balance;

    public CreditCard(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на карточке.");
        }
    }

    public void printCardInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий баланс: " + balance);
    }
}
