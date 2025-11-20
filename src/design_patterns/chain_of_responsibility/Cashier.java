package design_patterns.chain_of_responsibility;

public class Cashier extends Approver{
    @Override
    public void handleRequest(int amount) {
        if (amount<=1000){
            System.out.println("kashier"+amount+"azn tesdiqleyir");
        } else if (approver!=null) {
            approver.handleRequest(amount);
        }
    }
}
