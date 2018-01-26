package builder;

/**
 * Created by guan on 9/22/16.
 */
public abstract class Builder {

    Product product=new Product();

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    protected void testFunction()
    {

    }

    public abstract void buildAttribute1(String s);
    public abstract void buildAttribute2(String s);
    public abstract void buildAttribute3(String s);
    public abstract void buildAttribute4(String s);
    public abstract void buildAttribute5(String s);

}
