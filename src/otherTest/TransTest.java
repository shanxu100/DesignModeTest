package otherTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Handler;


/**
 * Created by guan on 3/3/17.
 */
public class TransTest {



    private ScheduledExecutorService executor= Executors.newSingleThreadScheduledExecutor();


    public TransTest()
    {

    }

    public void testHandler()
    {

    }


    public void testExecutor()
    {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("executor first!---start-----"+Thread.currentThread().getId());
                testFunction();
                try {
                    Thread.sleep(5000);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }

                System.out.println("executor first!---end");

            }
        });
    }

    public void testFunction()
    {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("executor second!-----"+Thread.currentThread().getId());
            }
        });
    }

    public static void main(String[] args)
    {
        TransTest tt=new TransTest();
        System.out.println("main thread: "+ Thread.currentThread().getId());
        tt.testExecutor();


    }
}
