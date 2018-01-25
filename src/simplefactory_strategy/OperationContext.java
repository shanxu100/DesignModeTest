package simplefactory_strategy;

import simplefactory_strategy.operation.*;

/**
 * Created by guan on 9/18/16.
 */
public class OperationContext {

    Operation operation;

    /**
     * 策略模式和简单工厂模式相结合
     *
     * @param ope
     * @param a
     * @param b
     */
    public OperationContext(String ope, double a, double b) {

        switch (ope) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                operation = new AddOperation();
                break;
        }
        operation.NumberA = a;
        operation.NumberB = b;

    }

    /**
     * 只使用 策略模式
     *
     * @param operation
     * @param a
     * @param b
     */
    public OperationContext(Operation operation, double a, double b) {
        this.operation = operation;
        operation.NumberA = a;
        operation.NumberB = b;

    }

    public void doOperation() {
        operation.doOperation();
    }
}
