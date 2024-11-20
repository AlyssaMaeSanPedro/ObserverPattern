import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    private String subscriberName;
    private List<String> preferredCategories;

    public Subscriber() {
        this.preferredCategories = new ArrayList<>();
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public List<String> getPreferredCategories() {
        return preferredCategories;
    }

    public void addPrefCat(List<String> categories) {
        for (String category : categories) {
            if (!preferredCategories.contains(category)) {
                preferredCategories.add(category);
            }
        }
    }

    public void removePrefCat(String category) {
        preferredCategories.remove(category);
    }

}
