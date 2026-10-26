package observePattern;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber redge = new Subscriber("Redge", "Technology");
        Subscriber marc = new Subscriber("Marc", "Sports");
        Subscriber joe = new Subscriber("Joe", "ALL");

        // Subscribe users
        agency.subscribe(redge);
        agency.subscribe(marc);
        agency.subscribe(joe);

        // Publish breaking news
        agency.publishNews
                (
                "New AI technology has been developed!",
                "Technology"
                );

        agency.publishNews
                (
                "The national team wins the championship!",
                "Sports"
                );

        // Modify subscription preference
        redge.setPreferredCategory("Sports");

        agency.publishNews
                (
                "A major sports tournament is announced!",
                "Sports"
                );

        // Unsubscribe a user
        agency.unsubscribe(marc);

        agency.publishNews
                (
                "A new sports event begins today!",
                "Sports"
                );
    }
}
