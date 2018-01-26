package proxy;

/**
 * Created by guan on 9/18/16.
 */
public class Real implements ToDoTask {

    String RealTAG="BABABABABA";

    public Real(String realTAG)
    {
        this.RealTAG=realTAG;
    }

    @Override
    public void doTask1() {
        System.out.println("This is Real. be doing doTask1()");
    }

    @Override
    public void doTask2() {
        System.out.println("This is Real. be doing doTask2()");
    }

    @Override
    public void doTask3() {
        System.out.println("This is Real. be doing doTask3()");
    }
}
