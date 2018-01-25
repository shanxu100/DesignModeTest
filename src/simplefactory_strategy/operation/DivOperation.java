package simplefactory_strategy.operation;

/**
 * Created by guan on 9/18/16.
 */
public class DivOperation extends Operation {
    @Override
    public void doOperation() {
        if(NumberB!=0)
        {
            System.out.println(NumberA/NumberB);
        }else{
            System.out.println("Error");
        }
    }

    @Override
    public void showInfo() {
        System.out.println("This is DivOperation.");
    }
}
