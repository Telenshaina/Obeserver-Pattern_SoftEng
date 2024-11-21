package NewsSubService;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    private List<SubscriberObserver> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(SubscriberObserver subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(SubscriberObserver subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (SubscriberObserver subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifySubscribers(news);
    }
}
