package simplefactory_strategy;

/**
 * Created by guan on 9/18/16.
 *
 * 策略模式和简单工厂模式相结合
 */
public class OperationContext {

    Operation operation;

    public OperationContext(String ope,double a,double b) {

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
        operation.NumberA=a;
        operation.NumberB=b;

    }

    public void doOperation()
    {
        operation.doOperation();
    }
}
