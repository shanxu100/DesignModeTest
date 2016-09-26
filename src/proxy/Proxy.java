package proxy;

/**
 * Created by guan on 9/18/16.
 */
public class Proxy implements ToDoTask {
    Real real;

    public Proxy(String realTAG)
    {
        this.real=new Real(realTAG);
    }

    @Override
    public void doTask1() {
        System.out.print("Proxy has done something. Then …… ");
        real.doTask1();
    }

    @Override
    public void doTask2() {
        System.out.print("Proxy has done something. Then …… ");
        real.doTask2();
    }

    @Override
    public void doTask3() {
        System.out.print("Proxy has done something. Then …… ");
        real.doTask3();
    }
}
