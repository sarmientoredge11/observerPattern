package observePattern;


public class Subscriber implements NewsSubscriber {
    private String name;
    private String preferredCategory;

    public Subscriber(String name, String preferredCategory) {
        this.name = name;
        this.preferredCategory = preferredCategory;
    }

    public void setPreferredCategory(String category) {
        this.preferredCategory = category;
    }

    @Override
    public void update(String news, String category) {
        if (preferredCategory.equalsIgnoreCase("ALL")
                || preferredCategory.equalsIgnoreCase(category)) {
            System.out.println(
                    name + " received [" + category + "]: " + news
            );
        }
    }
}
