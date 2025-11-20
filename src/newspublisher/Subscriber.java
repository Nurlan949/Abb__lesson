package newspublisher;

public class Subscriber extends Thread {
    private NewsPublisher newsPublisher;
    private String name;

    public Subscriber(NewsPublisher newsPublisher, String name) {
        this.newsPublisher = newsPublisher;
        this.name = name;
    }



    public synchronized void update(String news) {
        try {
            System.out.println(name+"="+"xəbər aldı:"+news);
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (true){
            String news=newsPublisher.getNews();
            update(news);
        }
    }


}
