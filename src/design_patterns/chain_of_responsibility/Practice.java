package design_patterns.chain_of_responsibility;

public class Practice {
    public static void main(String[] args) {
        Approver cashier = new Cashier();
        Approver director = new Director();
        Approver manager = new Manager();
        cashier.setApprover(manager);
        manager.setApprover(director);
        System.out.println("200 azn cixarmaq isteyir");
        cashier.handleRequest(200);
        System.out.println("3000 azn cixarmaq isteyir");
        cashier.handleRequest(3000);
        System.out.println("10000 azn cixarmaq isteyir");
        cashier.handleRequest(10000);
        System.out.println("200 manat cixarmaq isteyir");
        manager.handleRequest(200);

    }


}
