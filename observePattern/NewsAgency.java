package observePattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NewsAgency {
    private final List<NewsSubscriber> subscribers =
            new CopyOnWriteArrayList<>();

    public void subscribe(NewsSubscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("\nSubscriber added.");
        }
    }

    public void unsubscribe(NewsSubscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("\nSubscriber removed.");
        }
    }

    public void publishNews(String news, String category) {
        System.out.println("\nBREAKING NEWS: " + news);
        notifySubscribers(news, category);
    }

    private void notifySubscribers(String news, String category) {
        for (NewsSubscriber subscriber : subscribers) {
            subscriber.update(news, category);
        }
    }
}
