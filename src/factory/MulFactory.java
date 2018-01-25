package factory;

import simplefactory_strategy.operation.MulOperation;
import simplefactory_strategy.operation.Operation;

/**
 * Created by guan on 9/18/16.
 */
public class MulFactory implements Factory {
    @Override
    public Operation CreateOperation() {
        return new MulOperation();
    }
}
