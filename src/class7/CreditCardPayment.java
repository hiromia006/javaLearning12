package class7;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to Credit Card.");
    }
}
