package NewsSubService;
// Subject
public interface NewsAgency { void subscribe(Subscriber subscriber); void unsubscribe(Subscriber subscriber); void notifySubscribers(String news); }