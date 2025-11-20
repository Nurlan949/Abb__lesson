package design_patterns.Strategy;

public class GPPPayment implements PaymentService{
    @Override
    public void doPayment() {
        System.out.println("processing is GPPPayment");
    }
}
