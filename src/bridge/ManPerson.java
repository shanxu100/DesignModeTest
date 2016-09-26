package bridge;

/**
 * Created by guan on 9/24/16.
 */
public class ManPerson  extends Person{

    public ManPerson(Body body, Country country) {
        super(body, country);
    }

    @Override
    public void WhoamI() {
        System.out.println("I am a man");
    }
}
