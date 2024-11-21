package NewsSubService;

public interface SubscriberObserver {
    // Observer
    void update(String news);
    String getSubscriberName(); 
}
