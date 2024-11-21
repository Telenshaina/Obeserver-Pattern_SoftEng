package NewsSubService;

// Subject
public interface NewsAgencySubject {
    void subscribe(SubscriberObserver subscriber); 
    void unsubscribe(SubscriberObserver subscriber); 
    String notifySubscribers(String news); // Returns a notification summary
}
