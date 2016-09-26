package simplefactory_strategy;

/**
 * Created by guan on 9/18/16.
 */
public class AddOperation extends Operation {
    @Override
    public void doOperation() {
        System.out.println(NumberA+NumberB);
    }

    @Override
    public void showInfo() {
        System.out.println("This is AddOperation.");
    }
}
