package builder;

/**
 * Created by guan on 9/22/16.
 */
public class ProductBuilder extends Builder {

    @Override
    protected void testFunction() {
        super.testFunction();
    }

    @Override
    public void buildAttribute1(String s) {
        product.attribute1=s;
    }

    @Override
    public void buildAttribute2(String s) {
        product.attribute2=s;
    }

    @Override
    public void buildAttribute3(String s) {
        product.attribute3=s;
    }

    @Override
    public void buildAttribute4(String s) {
        product.attribute4=s;
    }

    @Override
    public void buildAttribute5(String s) {
        product.attribute5=s;
    }
}
