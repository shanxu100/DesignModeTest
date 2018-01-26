package simplefactory_strategy;

import factory.AddFactory;
import simplefactory_strategy.operation.AddOperation;
import simplefactory_strategy.operation.Operation;

/**
 * Created by guan on 9/18/16.
 */
public class Client {



    public static void main(String[] args)
    {

        /**
         * 只使用策略模式：客户端需要指定Operation
         */
        System.out.println("\nOnly Strategy===============");
        OperationContext opeContext=new OperationContext(new AddOperation(),2,3);
        opeContext.doOperation();


        /**
         * 简单工厂模式的使用，客户端需要知道两个类：OperationFactory和Operation
         */
        System.out.println("\nSimple Factory================");
        Operation operation;
        operation=OperationFactory.createOperation("+");
        operation.NumberA=1;
        operation.NumberB=2;
        operation.doOperation();

        /**
         * 简单工厂和策略模式的相结合，客户端只需要知道一个类：OperationContext
         */
        System.out.println("\nSimpleFactory & Strategy===============");
        OperationContext operationContext=new OperationContext("+",2,3);
        operationContext.doOperation();

        /**
         * 工厂模式：每一个Factory对应一个“产品类”
         * 工厂模式符合了“开放-封闭”原则，因为每增加一种新的“产品”，只需要创建一个新的Factory。而不需要像简单工厂一样，每次都得修改Factory的代码
         * 简单工厂最大的有点就是：Factory中包含了逻辑判断，可以根据客户端的选择动态的实例化相关的类。
         */
        System.out.print("\nFactory====================");
        Operation addOperation=new AddFactory().CreateOperation();
        addOperation.NumberA=4;
        addOperation.NumberB=5;
        addOperation.showInfo();
        addOperation.doOperation();

    }

}
