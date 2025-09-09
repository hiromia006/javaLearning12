package class7;

public class InterfaceTest {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment();
        ccp.pay(100.0);    // Outputs: Paid 100.0 using Credit Card.
        ccp.refund(50.0);  // Outputs: Refunded 50.0 to Credit Card.

        System.out.println("------------------");
        Payment ppp = new CreditCardPayment();
        ppp.pay(200.0);    // Outputs: Paid 200.0 using PayPal.
        ppp.refund(75.0);  // Outputs: Refunded 75.0 to PayPal.
    }
}
