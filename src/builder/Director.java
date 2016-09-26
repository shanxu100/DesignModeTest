package builder;

/**
 * Created by guan on 9/22/16.
 */
public class Director {
    ProductBuilder pb;
    public Director(ProductBuilder pb)
    {
        this.pb=pb;
    }

    public void setPb(ProductBuilder pb)
    {
        this.pb=pb;
    }

    public Product CreateProduct()
    {
        pb.buildAttribute1("attribute 1");
        pb.buildAttribute2("attribute 2");
        pb.buildAttribute3("attribute 3");
        pb.buildAttribute4("attribute 4");
        pb.buildAttribute5("attribute 5");
        return pb.getProduct();
    }
}
