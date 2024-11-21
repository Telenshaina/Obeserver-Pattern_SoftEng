package NewsSubService;
public class Subscriber implements SubscriberObserver {

    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    @Override
    public void update(String news) {
        System.out.println("\n" + subscriberName + " received news: " + news );
    }
}
