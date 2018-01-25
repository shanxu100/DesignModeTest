package observer;

import observer.publisher.Cup;
import observer.publisher.Pen;
import observer.subscriber.Student;
import observer.subscriber.Teacher;

/**
 * Created by guan on 9/20/16.
 */
public class Client {

    public static void main(String[] qrgs)
    {
        Student s1=new Student("Student 1");
        Teacher t2=new Teacher("Teacher 2");
        Pen p3=new Pen("FirstName","FirstColor");
        Cup cup=new Cup("myCup",20);
        p3.addSubscriber(s1);
        p3.addSubscriber(t2);
        cup.addSubscriber(s1);
        p3.setColor("Blue");
        p3.setName("Hero");
        cup.setPrice(30);


    }
}
