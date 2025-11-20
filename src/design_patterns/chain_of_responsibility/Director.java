package design_patterns.chain_of_responsibility;

public class Director extends Approver{
    @Override
    public void handleRequest(int amount) {
        if (amount>5000){
            System.out.println("director"+amount+"azn director tesdiqleyir");
        } else if (approver!=null) {
            approver.handleRequest(amount);

        }
    }
}
