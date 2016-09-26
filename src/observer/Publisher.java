package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lianglitu on 16/9/19.
 */
public abstract class Publisher {
    List<Subscriber> subscribers=new LinkedList<>();

    public void addSubscriber(Subscriber subscriber)
    {
        this.subscribers.add(subscriber);
    }

    public void removeSubscribe(Subscriber subscriber)
    {
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers(Object key,Object value)
    {
        for(Subscriber subscriber : subscribers)
        {
            subscriber.Update(key,value);
        }
    }

}
