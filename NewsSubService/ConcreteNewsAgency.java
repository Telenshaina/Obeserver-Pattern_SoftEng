package NewsSubService;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNewsAgency implements NewsAgency {

    private List<Subscriber> subscribers;

    public ConcreteNewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifySubscribers(news);
    }
}
