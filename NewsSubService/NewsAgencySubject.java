package NewsSubService;
// Subject
public interface NewsAgencySubject { void subscribe(SubscriberObserver subscriber); void unsubscribe(SubscriberObserver subscriber); void notifySubscribers(String news); }