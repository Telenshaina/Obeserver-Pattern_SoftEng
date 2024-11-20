package NewsSubService;

public class Main {
    public static void main(String[] args) {
        ConcreteNewsAgency newsAgency = new ConcreteNewsAgency();

        Subscriber maria = new ConcreteSubscriber("Maria");
        Subscriber juan = new ConcreteSubscriber("Juan");
        Subscriber oliver = new ConcreteSubscriber("Oliver");

        // Subscribe the clients
        newsAgency.subscribe(maria);
        newsAgency.subscribe(juan);
        newsAgency.subscribe(oliver);

        // Publish news
        newsAgency.publishNews("Breaking News: New Technology Released!");

        // Update subscribers list: remove Juan, add Jerry
        newsAgency.unsubscribe(juan);
        Subscriber jerry = new ConcreteSubscriber("Jerry");
        newsAgency.subscribe(jerry);

        // Publish another news
        newsAgency.publishNews("Update: Major Discovery in Science!");

        // Further modification on preferences can be added here
    }
}
