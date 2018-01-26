package observer.subscriber;

import observer.publisher.BasePublisher;

import java.util.Observer;

/**
 * @author Guan
 * @date Created on 2018/1/25
 */
public interface BaseSubscriber {

//    BaseSubscriber(BasePublisher publisher);

    void update(String msg);

}
