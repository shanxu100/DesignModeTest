package bridge;

/**
 * Created by guan on 9/24/16.
 */
public class WomanPerson extends Person{


    public WomanPerson(Body body, Country country) {
        super(body, country);
    }

    @Override
    public void WhoamI() {
        System.out.println("I am a woman.");
    }
}
