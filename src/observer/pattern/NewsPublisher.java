package observer.pattern;

import java.util.ArrayList;

/**
 * Created by Jessenia on 5/18/14.
 */
public class NewsPublisher {
    ArrayList<Subscriber> subscribers;
    String latestNews;

    public ArrayList<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(ArrayList<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
    }

    public void attach(Subscriber subscriber){

    }

    public void detach(Subscriber subscriber){

    }

    public void notifyObservers(){

    }

    public void addNews(int news){

    }

    public String getLatestNews(){
        return "unimplemented";
    }


}

