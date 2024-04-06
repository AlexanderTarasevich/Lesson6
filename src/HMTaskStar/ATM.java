package HMTaskStar;

public class ATM {
    int twentyBills;
    int fiftyBills;
    int hundredBills;

    public ATM(int twentyBills, int fiftyBills, int hundredBills) {
        this.twentyBills = twentyBills;
        this.fiftyBills = fiftyBills;
        this.hundredBills = hundredBills;
    }

    public void addMoney(int twenties, int fifties, int hundreds) {
        twentyBills += twenties;
        fiftyBills += fifties;
        hundredBills += hundreds;
    }

    public boolean withdrawMoney(int amount) {
        int remainingAmount = amount;

        int hundredsToWithdraw = Math.min(remainingAmount / 100, hundredBills);
        remainingAmount -= hundredsToWithdraw * 100;

        int fiftiesToWithdraw = Math.min(remainingAmount / 50, fiftyBills);
        remainingAmount -= fiftiesToWithdraw * 50;

        int twentiesToWithdraw = Math.min(remainingAmount / 20, twentyBills);
        remainingAmount -= twentiesToWithdraw * 20;

        if (remainingAmount == 0) {
            hundredBills -= hundredsToWithdraw;
            fiftyBills -= fiftiesToWithdraw;
            twentyBills -= twentiesToWithdraw;
            System.out.println("Снятие наличных!");
            System.out.println("Выдано: " + hundredsToWithdraw + "x100, " +
                    fiftiesToWithdraw + "x50, " + twentiesToWithdraw + "x20");
            return true;
        } else {
            System.out.println("Недостаточно купюр в банкомате.");
            return false;
        }
    }

    public void printATMInfo() {
        System.out.println("Количество купюр в банкомате:");
        System.out.println("20: " + twentyBills);
        System.out.println("50: " + fiftyBills);
        System.out.println("100: " + hundredBills);
    }

}


