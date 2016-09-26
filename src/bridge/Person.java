package bridge;

/**
 * Created by guan on 9/24/16.
 */
public abstract class Person {
    Body body;
    Country country;
    public Person(Body body,Country country)
    {
        this.body=body;
        this.country=country;
    }

    public abstract void WhoamI();

    public void showMe()
    {
        WhoamI();
        body.How();
        country.Where();
    }

}
