package template;

/**
 * Created by guan on 9/18/16.
 */
public class ConcreteClass2 extends Template {
    String TAG=this.getClass().getSimpleName();

    @Override
    public String doSomething1() {
        return TAG+"\tdoSomething1";
    }

    @Override
    public String doSomething2() {
        return TAG+"\tdoSomething2";
    }

    @Override
    public String doSomething3() {
        return TAG+"\tdoSomething3";
    }
}
