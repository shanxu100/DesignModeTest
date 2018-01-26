package observer.subscriber;

import observer.publisher.BasePublisher;

/**
 * @author Guan
 * @date Created on 2018/1/25
 */
public class TestSubscriber implements BaseSubscriber {

    public void subscribe(BasePublisher publisher) {
        publisher.addSubscriber(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("TestSubscriber -- receive new message: " + msg);
    }
}
