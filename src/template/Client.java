package template;

/**
 * Created by guan on 9/18/16.
 */
public class Client {

    public static void main(String[] args)
    {
        /**
         * 模板方法模式：
         * 把子类共同的代码放入到超类中，在子类中定义自己特有的行为，这样可以去除子类中的重复代码
         */
        ConcreteClass1 c1=new ConcreteClass1();
        ConcreteClass2 c2=new ConcreteClass2();
        c1.show();
        c2.show();
    }

}
