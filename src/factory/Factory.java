package factory;

import simplefactory_strategy.operation.Operation;

/**
 * Created by guan on 9/18/16.
 */
public interface Factory {

    public Operation CreateOperation();
}
