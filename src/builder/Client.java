package builder;

/**
 * Created by guan on 9/22/16.
 */
public class Client {


    public static void main(String[] args)
    {
        ProductBuilder pb=new ProductBuilder();
        Director director=new Director(pb);

        Product product=director.CreateProduct();
        product.showProduct();
    }

}
