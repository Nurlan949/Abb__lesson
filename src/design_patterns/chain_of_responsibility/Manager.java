package design_patterns.chain_of_responsibility;

public class Manager extends Approver{
    @Override
    public void handleRequest(int amount) {
        if (amount<=5000){
            System.out.println("mudur"+amount+"azn tesdiqleyir");
        }else if (approver!=null){
            approver.handleRequest(amount);
        }
    }
}
