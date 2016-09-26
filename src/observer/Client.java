package observer;

/**
 * Created by guan on 9/20/16.
 */
public class Client {

    public static void main(String[] qrgs)
    {
        Student s1=new Student("Student 1");
        Teacher t2=new Teacher("Teacher 2");
        Pen p3=new Pen("FirstName","FirstColor");
        p3.addSubscriber(s1);
        p3.addSubscriber(t2);
        p3.setColor("Blue");
        p3.setName("Hero");


    }
}
