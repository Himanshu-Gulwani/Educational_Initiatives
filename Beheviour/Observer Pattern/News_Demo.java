import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String news);
}

class MorningNews implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Morning News: " + news);
    }
}

class EveningNews implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Evening News: " + news);
    }
}

class NewsPublisher {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String news) {
        LocalTime currentTime = LocalTime.now();
        String period = currentTime.isBefore(LocalTime.NOON) ? "Morning" : "Evening";
        for (Observer observer : observers) {
            if ((period.equals("Morning") && observer instanceof MorningNews)
                || (period.equals("Evening") && observer instanceof EveningNews)) {
                observer.update(news);
            }
        }
    }
}

public class News_Demo {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        MorningNews morningNews = new MorningNews();
        EveningNews eveningNews = new EveningNews();

        publisher.addObserver(morningNews);
        publisher.addObserver(eveningNews);

        publisher.notifyObservers("Breaking news: There is a Earthquack in XYZ Region.");

        publisher.removeObserver(eveningNews);

        publisher.notifyObservers("Latest update: Market Crashes.");
    }
}
