package NewsSubService;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {

    private String agencyName;
    private List<SubscriberObserver> subscriberList; 
    public NewsAgency() {
        this.subscriberList = new ArrayList<>(); // Initialize the list
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<SubscriberObserver> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<SubscriberObserver> subscriberList) {
        this.subscriberList = subscriberList;
    }

     @Override
    public void subscribe(SubscriberObserver subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(SubscriberObserver subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscribers(String news) {
        StringBuilder notifications = new StringBuilder();
        for (SubscriberObserver subscriber : subscriberList) {
            notifications.append("Notification sent to: ").append(subscriber.getSubscriberName()).append("\n");
            subscriber.update(news);
        }
        return notifications.toString();
    }

    public String publishNews(String news) {
        System.out.println("Publishing news: " + news);
        return notifySubscribers(news);
    }
}
