package practices_1.task6;

public class NotificationService {
    public void notifyUser() throws InterruptedException {
        synchronized (this) {
            System.out.println("trying to send notification to user");
            this.wait();
            System.out.println("sending notification to user:");
        }
    }
    public void notifyAdmin(){
        System.out.println("trying to send notification to admin...");
        synchronized (this){
            System.out.println("sending notification to admin");
            this.notifyAll();
        }
    }
}
