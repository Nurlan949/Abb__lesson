package newspublisher;

public class Main {
    public void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        Subscriber s1 = new Subscriber(publisher, "s1");
        Subscriber s2 = new Subscriber(publisher, "s2");
        Subscriber s3 = new Subscriber(publisher, "s3");

        s1.start();
        s2.start();
        s3.start();
        publisher.addSubscriber(s1);
        publisher.addSubscriber(s2);
        publisher.addSubscriber(s3);

        int count = 1;
        while (true) {
            synchronized (this) {
                String news="Xber"+count++;
                publisher.publishNews(news);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
