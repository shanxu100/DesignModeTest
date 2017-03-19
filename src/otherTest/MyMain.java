package otherTest;

import java.util.ArrayList;

/**
 * Created by guan on 3/18/17.
 */
public class MyMain {
    ObjectTest ot;
    ArrayList<String> list=new ArrayList<>();

    public void setString(String s)
    {
        s="123456";
    }
    public ArrayList<String> getList() {
        return list;
    }

    public void myPrint()
    {
        ot.printString();
    }

    public static void main(String [] args)
    {
        MyMain mm=new MyMain();
        String s="asd";
        mm.setString(s);
        System.out.println(s);


    }
}
