package simplefactory_strategy.operation;

/**
 * Created by guan on 9/18/16.
 */
public class SubOperation extends Operation {
    @Override
    public void doOperation() {
        System.out.println(NumberA-NumberB);

    }

    @Override
    public void showInfo() {
        System.out.println("This is SubOperation.");
    }
}
