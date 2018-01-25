package simplefactory_strategy.operation;

/**
 * Created by guan on 9/18/16.
 */
public class MulOperation extends Operation {
    @Override
    public void doOperation() {
        System.out.println(NumberA*NumberB);

    }

    @Override
    public void showInfo() {
        System.out.println("This is MulOperation.");
    }
}
