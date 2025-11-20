package newspublisher;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String lastNews = null;

    public synchronized void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);

    }
    public synchronized void publishNews(String news) {
            this.lastNews = news;
            System.out.println("Yeni xəbər yayımlandı" + news);
            notifyAll();

    }

    public synchronized String getNews() {
       while (lastNews == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        String news=lastNews;
        lastNews=null;
        return news;
    }


}
