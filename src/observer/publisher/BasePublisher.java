package observer.publisher;

import observer.subscriber.BaseSubscriber;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guan
 * @date Created on 2018/1/25
 */
public abstract class BasePublisher {

    private List<BaseSubscriber> subscriberList = new ArrayList<>();

    public void addSubscriber(BaseSubscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println("添加Subscriber后，subscriberList.size()="+subscriberList.size());

    }

    public void deleteSubscriber(BaseSubscriber subscriber) {
        int index = subscriberList.indexOf(subscriber);
        if (index != -1) {
            subscriberList.remove(index);
        }
        System.out.println("删除Subscriber后，subscriberList.size()="+subscriberList.size());
    }

    public void notifyChanged(String msg)
    {
        for (BaseSubscriber subscriber:subscriberList)
        {
            subscriber.update(msg);
        }
    }


}
