package observer.publisher;

/**
 * @author Guan
 * @date Created on 2018/1/25
 */
public class TestPublisher extends BasePublisher {

    public void testPublish(String msg)
    {
        notifyChanged(msg);
    }
}
