

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public void eatAffordably() {
        if (balance - 2.6 < 0) {
            balance = balance;
        } else {
            balance = balance - 2.6;
        }
    }

    public void eatHeartily() {
        if (balance - 4.6 < 0) {
            balance = balance;
        } else {
            balance = balance - 4.6;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance +
                " euros";
    }

    public void addMoney(double money) {

        if (money < 0) {
            balance = balance;
//        } else if (balance > 150) {
//            balance = 150;
        } else {
            balance = balance + money;
        }
        if (balance > 150) {
            balance = 150;
        }
    }
}
