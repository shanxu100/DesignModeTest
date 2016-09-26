package proxy;

/**
 * Created by guan on 9/18/16.
 */
public class Client {

    public static void main(String[] args)
    {
        Proxy proxy=new Proxy("GuanTAG");
        proxy.doTask1();
        proxy.doTask2();
        proxy.doTask3();
    }
}
