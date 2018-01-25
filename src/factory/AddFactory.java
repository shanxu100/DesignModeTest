package factory;

import simplefactory_strategy.operation.AddOperation;
import simplefactory_strategy.operation.Operation;

/**
 * Created by guan on 9/18/16.
 */
public class AddFactory implements Factory {
    @Override
    public Operation CreateOperation() {
        return new AddOperation();
    }
}
