package factory;

import simplefactory_strategy.operation.Operation;
import simplefactory_strategy.operation.SubOperation;

/**
 * Created by guan on 9/18/16.
 */
public class SubFactory implements Factory {
    @Override
    public Operation CreateOperation() {
        return new SubOperation();
    }
}
