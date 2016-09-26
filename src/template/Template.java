package template;

/**
 * Created by guan on 9/18/16.
 */
public abstract class Template {

    /**
     * 这里定义子类共有的行为，然后调用“包含子类特有行为”的抽象方法
     */
    public void template1()
    {
        System.out.println("This is template1: "+doSomething1());
    }

    public void template2()
    {
        System.out.println("This is template2: "+doSomething2());
    }

    public void template3()
    {
        System.out.println("This is template3: "+doSomething3());
    }


    /**
     * 这些抽象方法在规定了子类的“特有行为”
     * @return
     */
    public abstract String doSomething1();

    public abstract String doSomething2();

    public abstract String doSomething3();

    public void show()
    {
        template1();
        template2();
        template3();
    }
}
