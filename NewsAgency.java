import java.util.*;

public class NewsAgency {
    private Map<String, String> categoryNewsMap;  // Holds news for each category
    private List<Subscriber> subscriberList;
    private String currentCategory;  // Current category of news

    public NewsAgency() {
        categoryNewsMap = new HashMap<>();
        subscriberList = new ArrayList<>();
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    public void setLatestNews(String category, String news) {
        categoryNewsMap.put(category, news);
    }

    public void setCategory(String category) {
        this.currentCategory = category;
    }

    public String getCategory() {
        return currentCategory;
    }

    public String getLatestNews() {
        return categoryNewsMap.get(currentCategory);
    }

    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public String notifySubscribers() {
        StringBuilder output = new StringBuilder();
        for (Subscriber subscriber : subscriberList) {
            if (subscriber.getPreferredCategories().isEmpty() || subscriber.getPreferredCategories().contains(currentCategory)) {
                output.append("Hey, ").append(subscriber.getSubscriberName()).append("!\n");
                output.append("Here's the latest news: ").append(getLatestNews()).append("\n\n");
            }
        }
        return output.toString();
    }
}