interface PaymentGateway {
    void processPayment(double amount);
}
class CreditCardGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class PayPalGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
class BitcoinGateway implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}
class PaymentProcessor {
    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processPayment(double amount) {
        gateway.processPayment(amount);
    }
}
public class OCP {
    public static void main(String[] args) {

        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardGateway());
        creditCardProcessor.processPayment(100.0);

        PaymentProcessor paypalProcessor = new PaymentProcessor(new PayPalGateway());
        paypalProcessor.processPayment(200.0);

        PaymentProcessor bitcoinProcessor = new PaymentProcessor(new BitcoinGateway());
        bitcoinProcessor.processPayment(300.0);
    }
}
