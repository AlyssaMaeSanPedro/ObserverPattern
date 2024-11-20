import java.util.*;

public class NewsSubscriptionService {
    public static void main(String[] args) {

        Subscriber alyssa = new Subscriber();
        alyssa.setSubscriberName("Alyssa");
        alyssa.addPrefCat(Arrays.asList("Weather", "Politics"));

        Subscriber mae = new Subscriber();
        mae.setSubscriberName("Mae");
        mae.addPrefCat(Collections.singletonList("Sports"));

        Subscriber rafayel = new Subscriber();
        rafayel.setSubscriberName("Rafayel");

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(alyssa);
        subscriberList.add(mae);
        subscriberList.add(rafayel);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setSubscriberList(subscriberList);

        newsAgency.setLatestNews("Weather", "Super Typhoon Pepito leaves PAR");
        newsAgency.setLatestNews("Sports", "Local team wins the championship");
        newsAgency.setLatestNews("Politics", "Election campaign continues");
        newsAgency.setLatestNews("Technology", "New smartphone release");

        System.out.println("Breaking News: Weather Report");
        newsAgency.setCategory("Weather");
        System.out.println(newsAgency.notifySubscribers());

        System.out.println("Breaking News: Sports Updates!");
        newsAgency.setCategory("Sports");
        System.out.println(newsAgency.notifySubscribers());

        System.out.println("Breaking News: Updates in politics!");
        newsAgency.setCategory("Politics");
        System.out.println(newsAgency.notifySubscribers());

        System.out.println("Breaking News: Tech Talk!");
        newsAgency.setCategory("Technology");
        System.out.println(newsAgency.notifySubscribers());

        //MAE UNSUBSCRIBED
        newsAgency.unsubscribe(mae);
        
        //ALYSSA MODIFIED PREFFERED CATEGORIES
        alyssa.removePrefCat("Weather");

        newsAgency.setLatestNews("Weather", "Tropical cyclone warning");
        
        System.out.println("Breaking News: Weather Report");
        newsAgency.setCategory("Weather");
        System.out.println(newsAgency.notifySubscribers());

        System.out.println("Breaking News: Updates in politics!");
        newsAgency.setCategory("Politics");
        System.out.println(newsAgency.notifySubscribers());
    }
}
