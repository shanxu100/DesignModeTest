package otherTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guan on 3/2/17.
 */
public class ObjectTest {
    String s = "abc";

    List<String> list;

    public void printString() {
        System.out.println(s);
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void testList(String addStr) {
        list.add(addStr);
    }


    public void printList()
    {
        if (list.size()<=0)
        {
            System.out.println("list is empty~!");
            return;
        }
        for (String s:list)
        {
            System.out.println(s);
        }
    }

}
