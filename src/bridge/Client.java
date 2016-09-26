package bridge;

/**
 * Created by guan on 9/24/16.
 */
public class Client {
    public static void main(String[] args) {
        Person person=new ManPerson(new FatBody(),new America());
        person.showMe();

        System.out.println("=====================");

        person.body=new ThinBody();
        person.country=new China();
        person.showMe();
    }
}
