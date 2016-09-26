package factory;

import simplefactory_strategy.AddOperation;
import simplefactory_strategy.Operation;

/**
 * Created by guan on 9/18/16.
 */
public class AddFactory implements Factory {
    @Override
    public Operation CreateOperation() {
        return new AddOperation();
    }
}
