package simplefactory_strategy;

import simplefactory_strategy.operation.*;

/**
 * Created by guan on 9/18/16.
 * 简单工厂模式
 */
public class OperationFactory {

    public static Operation createOperation(String ope)
    {
        Operation operation;
        switch (ope)
        {
            case "+":
                operation=new AddOperation();
                break;
            case "-":
                operation=new SubOperation();
                break;
            case "*":
                operation=new MulOperation();
                break;
            case "/":
                operation=new DivOperation();
                break;
            default:
                operation=new AddOperation();
                break;
        }
        return operation;

    }


}
