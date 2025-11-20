package design_patterns.chain_of_responsibility;

public abstract class Approver {
    protected Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    public abstract void handleRequest(int amount);
}
