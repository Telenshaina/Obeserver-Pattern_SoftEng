package NewsSubService;

public class RNS {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        SubscriberObserver maria = new Subscriber("Maria");
        SubscriberObserver juan = new Subscriber("Juan");
        SubscriberObserver oliver = new Subscriber("Oliver");

        // Subscribe the clients
        newsAgency.subscribe(maria);
        newsAgency.subscribe(juan);
        newsAgency.subscribe(oliver);

        // Publish news
        newsAgency.publishNews("\nBreaking News: New Technology Released!\n");

        // Update subscribers list: remove Juan, add Jerry
        newsAgency.unsubscribe(juan);
        SubscriberObserver jerry = new Subscriber("Jerry");
        newsAgency.subscribe(jerry);

        // Publish another news
        newsAgency.publishNews("\nUpdate: Major Discovery in Science!\n");

        
    }
}
