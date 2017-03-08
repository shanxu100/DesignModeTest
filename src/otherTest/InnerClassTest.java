package otherTest;

/**
 * Created by guan on 3/2/17.
 */
public class InnerClassTest {

    ObjectTest ot=new ObjectTest();

    public void OutPut()
    {
        new InnerClass().testS();
    }


    public class InnerClass{
        public void testS()
        {
            ot.printString();
        }
    }

    public static void main(String[] args)
    {
        new InnerClassTest().OutPut();
    }

}
