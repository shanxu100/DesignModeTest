package factory;

import simplefactory_strategy.DivOperation;
import simplefactory_strategy.Operation;

/**
 * Created by guan on 9/18/16.
 */
public class DivFactory implements Factory {
    @Override
    public Operation CreateOperation() {
        return new DivOperation();
    }
}
