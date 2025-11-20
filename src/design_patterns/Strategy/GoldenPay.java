package design_patterns.Strategy;

public class GoldenPay implements PaymentService {
    @Override
    public void doPayment() {
        System.out.println("processing is GoldenPay");
    }
}
