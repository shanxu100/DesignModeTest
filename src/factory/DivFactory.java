package factory;

import simplefactory_strategy.operation.DivOperation;
import simplefactory_strategy.operation.Operation;

/**
 * Created by guan on 9/18/16.
 */
public class DivFactory implements Factory {
    @Override
    public Operation CreateOperation() {
        return new DivOperation();
    }
}
