package design_patterns.Strategy;

public class Practice {
    public static void main(String[] args) {


        PaymentContext context = new PaymentContext(new GPPPayment());
        context.doPayment();
        PaymentContext context1=new PaymentContext(new GoldenPay());
        context1.doPayment();

    }
}
